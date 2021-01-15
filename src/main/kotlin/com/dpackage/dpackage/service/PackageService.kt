package com.dpackage.dpackage.service

import com.dpackage.dpackage.client.CorreiosClient
import com.dpackage.dpackage.model.PackageResponse
import com.dpackage.dpackage.repository.PackageRepository
import com.dpackage.dpackage.repository.UserRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class PackageService(
        private val packageRepository: PackageRepository,
        private val userRepository: UserRepository,
        private val correiosClient: CorreiosClient
) {

    fun getPackages(user: String): PackageResponse? {
        println(user)
        userRepository.findFirstByEmail(user).let {
            println("--------------------------")
            println(it)
            try {
                println(it.packageId)
                val response = correiosClient.getPackages(codigo = it.packageId)
                println(response.request().url())
                println("Package Found !")
                println("--------------------------")
                return response.execute().body()
            } catch (e: Exception) {
                throw ResponseStatusException(HttpStatus.BAD_REQUEST, e.message)
            }
        }
    }

}
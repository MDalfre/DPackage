package com.dpackage.dpackage.repository

import com.dpackage.dpackage.model.UserPackages
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface PackageRepository: MongoRepository<UserPackages, String> {
    fun findByEmail(email: String): Optional<UserPackages>
}
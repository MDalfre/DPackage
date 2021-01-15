package com.dpackage.dpackage.service

import com.dpackage.dpackage.model.RegisterRequest
import com.dpackage.dpackage.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserRegistration(
        private val userRepository: UserRepository
) {
    fun register(registerRequest: RegisterRequest): RegisterRequest{
        return userRepository.save(registerRequest)

    }

}
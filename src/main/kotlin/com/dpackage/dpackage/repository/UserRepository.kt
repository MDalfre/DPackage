package com.dpackage.dpackage.repository

import com.dpackage.dpackage.model.RegisterRequest
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: MongoRepository<RegisterRequest,String> {

    fun findFirstByEmail(email: String): RegisterRequest

}
package com.dpackage.dpackage.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class RegisterRequest(
        @Id
        @Indexed
        val id: UUID = UUID.randomUUID(),
        val email: String,
        val packageId: String
)
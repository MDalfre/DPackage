package com.dpackage.dpackage.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
class UserPackages(
        @Id
        val id: UUID = UUID.randomUUID(),
        val email: String,
        val userPackages: List<PackageResponse>
)
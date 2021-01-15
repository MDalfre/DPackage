package com.dpackage.dpackage.controller.v1

import com.dpackage.dpackage.model.PackageResponse
import com.dpackage.dpackage.model.RegisterRequest
import com.dpackage.dpackage.model.UserPackageRequest
import com.dpackage.dpackage.service.PackageService
import com.dpackage.dpackage.service.UserRegistration
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class RequestController(
        private val userRegistration: UserRegistration,
        private val packageService: PackageService
) {

    @PostMapping("/register")
    fun requestInit(@RequestBody registerRequest: RegisterRequest):RegisterRequest{
        return userRegistration.register(registerRequest)
    }

    @GetMapping("/package")
    fun getPackage(@RequestBody body: UserPackageRequest):PackageResponse? {
        return packageService.getPackages(body.email)
    }
}

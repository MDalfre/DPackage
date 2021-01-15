package com.dpackage.dpackage.model

data class PackageResponse(
        val codigo: String?,
        val servico: String?,
        val host: String?,
        val quantidade: Int?,
        val ultimo: String?,
        val time: Double,
        val eventos : List<PackageEvents>?
)

data class PackageEvents (
        val data: String?,
        val hora: String?,
        val local: String?,
        val status: String?,
        val subStatus: List<String>?
)
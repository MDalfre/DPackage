package com.dpackage.dpackage.client

import com.dpackage.dpackage.model.PackageResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CorreiosClient {

    @GET("/track/json")
    fun getPackages(
            @Query("user") user: String = "teste",
            @Query("token") token: String = "1abcd00b2731640e886fb41a8a9671ad1434c599dbaa0a0de9a5aa619f29a83f",
            @Query("codigo") codigo: String
    ): Call<PackageResponse>
}
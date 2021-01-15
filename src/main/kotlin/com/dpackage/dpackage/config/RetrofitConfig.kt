package com.dpackage.dpackage.config

import com.dpackage.dpackage.client.CorreiosClient
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import okhttp3.OkHttpClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

@Configuration
class RetrofitConfig {


    val mapper = ObjectMapper().registerModules(KotlinModule())

    @Bean
    fun buildNetwork(): CorreiosClient {
        val okHttpClientBuilder = OkHttpClient.Builder()
        return Retrofit.Builder()
                .baseUrl("https://api.linketrack.com/track/json/")
                .addConverterFactory(JacksonConverterFactory.create(mapper))
                .client(okHttpClientBuilder.build())
                .build()
                .create(CorreiosClient::class.java)
    }


}
package com.example.intellinotes.repository

import com.example.intellinotes.dto.response.MaterialResponse
import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface MaterialRepository {
    @GET("/mobile-backend-api/v1/materials") // TODO
    suspend fun getMaterials(): Response<List<MaterialResponse>>

    @GET("/mobile-backend-api/v1/materials/{id}") // TODO
    suspend fun getMaterial(id: String): Response<MaterialResponse>

    @Multipart
    @POST("/mobile-backend-api/v1/users/materials/mp3") // TODO
    suspend fun sendVoice(@Part files: MultipartBody.Part): Response<List<MaterialResponse>>

    @Multipart
    @POST("/mobile-backend-api/v1/users/materials/text") // TODO
    suspend fun sendText(@Part files: MultipartBody.Part): Response<List<MaterialResponse>>
}
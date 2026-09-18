package com.ahf2025.myapplication.data.api.request

import com.ahf2025.myapplication.data.api.data.TotalFoodList
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("foods/search")
    suspend fun getApiService(
        @Query("query") query: String,
        @Query("page_size") page_size: Int=10
    ): TotalFoodList

}
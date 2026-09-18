package com.ahf2025.myapplication.data.api.network

import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor(private val api_key: String) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val urlWithKet = original.url.newBuilder()
            .addQueryParameter("api_key", api_key)
            .build()
        val newRequest = original.newBuilder().url(urlWithKet).build()
        return chain.proceed(newRequest)
    }
}
package com.javiervass.composeinstagram.login.data.network

import com.javiervass.composeinstagram.login.data.network.response.LoginResponse
import retrofit2.Response
import retrofit2.http.GET

interface LoginClient {
    //https://run.mocky.io/v3/b530a8d0-a5f8-4148-9760-8c17391b09c2
    @GET("v3/b530a8d0-a5f8-4148-9760-8c17391b09c2")
    suspend fun doLogin(): Response<LoginResponse>
}
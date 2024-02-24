package com.javiervass.composeinstagram.login.data.network

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import javax.inject.Inject

class LoginService @Inject constructor(private val loginClient: LoginClient) {

    //private val retofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(user:String, password: String): Boolean{
       return withContext(Dispatchers.IO){
            val response = loginClient.doLogin()
            response.body()?.success ?: false
        }
    }
}
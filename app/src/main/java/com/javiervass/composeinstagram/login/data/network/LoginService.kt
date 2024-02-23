package com.javiervass.composeinstagram.login.data.network

import com.javiervass.composeinstagram.core.network.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoginService {

    private val retofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(user:String, password: String): Boolean{
       return withContext(Dispatchers.IO){
            val response = retofit.create(LoginClient::class.java).doLogin()
            response.body()?.success ?: false
        }
    }
}
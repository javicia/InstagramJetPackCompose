package com.javiervass.composeinstagram.login.data.network

class LoginRepository {
    private val api = LoginService()

    suspend fun doLogin(user:String, password:String): Boolean{
       return api.doLogin(user, password)
    }
}
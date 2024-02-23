package com.javiervass.composeinstagram.login.domain

import com.javiervass.composeinstagram.login.data.network.LoginRepository

class LoginUseCase {
    private val repository = LoginRepository()

    suspend operator fun invoke(user:String, password:String): Boolean{
        return repository.doLogin(user, password)
    }
}
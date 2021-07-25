package com.study.kotlinapi.dto

class UserDto{
    data class req(val email: String?, val name: String?,val password:String)
    data class res(val email: String, val name: String,val seq:Long)

}


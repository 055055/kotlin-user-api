package com.study.kotlinapi.service

import com.study.kotlinapi.dto.UserDto

interface UserService {
    fun save():UserDto.res
}
package com.study.kotlinapi.service

import com.study.kotlinapi.dto.UserDto
import org.springframework.stereotype.Service

@Service
class UserServiceImpl:UserService {

    override fun save(): UserDto.res {
        return UserDto.res("055055", "ik", 1)
    }
}
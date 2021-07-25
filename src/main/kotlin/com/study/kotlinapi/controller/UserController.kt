package com.study.kotlinapi.controller

import com.study.kotlinapi.dto.UserDto
import com.study.kotlinapi.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
class UserController(private val userService:UserService) {

    @PostMapping
    fun save(@RequestBody userDto: UserDto.req ) = userService.save()

    @GetMapping("/{seq}")
    fun get(@PathVariable seq: String){
        println("seq = ${seq}")
    }

}
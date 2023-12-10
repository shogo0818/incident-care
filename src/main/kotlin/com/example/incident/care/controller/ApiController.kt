package com.example.incident.care.controller

import com.example.incident.care.data.UserData
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiController {

    @GetMapping("/api/users")
    fun users(): List<UserData> {
        return listOf(
            UserData(id = 1, email = "tanaka@aaa.com",name = "tanaka"),
            UserData(id = 2, email = "nakamura@aaa.com",name = "nakamura"),
            UserData(id = 3, email = "kuniyoshi@aaa.com",name = "kuniyoshi")
            )
    }
}

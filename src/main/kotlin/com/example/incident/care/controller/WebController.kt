package com.example.incident.care.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WebController {


    @GetMapping("/")
    fun showLogin() = "login"


    @GetMapping("/top")
    fun showTop() = "top"

    @GetMapping("/user-management")
    fun manageUsers() = "user-management"

    @GetMapping("/bulletin-board")
    fun manageBulletinBoard() = "bulletin-board"

    @GetMapping("/incident-management")
    fun manageIncidents() = "incident-management"
}

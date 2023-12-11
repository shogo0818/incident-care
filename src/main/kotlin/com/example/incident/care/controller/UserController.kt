package com.example.incident.care.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.servlet.ModelAndView

@Controller
class UserController {

    @GetMapping("/register")
    fun showRegistrationForm(): String {
        return "register" //
    }

    @PostMapping("register")
    fun registerUser(@RequestParam email: String,
                     @RequestParam password: String,
                     @RequestParam confirmPassword: String): ModelAndView {
        // 登録処理（検証、ユーザーの保存など）
        // 登録が成功するとログイン（TOP）ページにリダイレクトされます
        return ModelAndView("login")
    }



}
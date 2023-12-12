package com.example.incident.care.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
class UserController {

    // Shows the registration form where the user can enter their email
    @GetMapping("/register")
    fun showRegistrationForm(): String {
        return "register"
    }

    // 提供された電子メールにリンクを送信して登録を処理します
    @PostMapping("/register")
    fun processRegistration(@RequestParam email: String): String {
        // Add logic to send a registration link to the email
        return "login"
    }

    // メールリンクをクリックすると、登録（パスワード設定）を完了するためのフォームが表示されます
    @GetMapping("/complete-registration")
    fun showCompleteRegistrationForm(@RequestParam("token") token: String, model: Model): String {
        model.addAttribute("token", token)
        return "complete-registration"
    }

    // ユーザーがパスワードを設定する登録の最終段階を処理します。
    @PostMapping("/complete-registration")
    fun completeRegistration(@RequestParam password: String,
                             @RequestParam confirmPassword: String,
                             @RequestParam token: String): String {
        // Add logic to verify the token and set the new password
        return "login" // Redirect to the login page
    }

    // ... Other methods ...

}

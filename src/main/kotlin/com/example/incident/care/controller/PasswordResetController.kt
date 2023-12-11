package com.example.incident.care.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
class PasswordResetController {

    @GetMapping("/reset-password")
    fun showResetPasswordForm(): String {
        return "reset-password" // The page where users can request a password reset
    }

    @PostMapping("/reset-password")
    fun processResetPassword(@RequestParam email: String): String {
        // Logic to send a verification code to the user's email
        return "verify-code" // The page to enter the received verification code
    }

    @PostMapping("/verify-code")
    fun verifyCode(@RequestParam code: String): String {
        // Logic to verify the code
        return "set-new-password" // The page to set a new password
    }

    @PostMapping("/set-new-password")
    fun setNewPassword(@RequestParam password: String,
                       @RequestParam confirmPassword: String): String {
        // Logic to update the user's password
        return "login" // Redirect to the login (TOP) page
    }
}

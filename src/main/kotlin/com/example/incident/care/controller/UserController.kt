package com.example.incident.care.controller

import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import java.util.*

@Controller
@RequestMapping("/register")
class UserController(private val emailSender: JavaMailSender) {

    @GetMapping
    fun showRegistrationForm(): String {
        return "register"
    }

    @PostMapping
    fun processRegistration(@RequestParam email: String): String {
        val token = UUID.randomUUID().toString() // Example token generation
        val resetLink = "http://yourdomain.com/set-new-password?token=$token" // Construct reset link

        val emailBody = getEmailContent(resetLink)
        sendTextEmail(email, "Welcome to our application!", emailBody)

        return "login"
    }

    private fun sendTextEmail(to: String, subject: String, text: String) {
        val message = SimpleMailMessage()
        message.setTo(to)
        message.setSubject(subject)
        message.setText(text)
        emailSender.send(message)
    }

    private fun getEmailContent(resetLink: String): String {
        return """
            Hello,

            Thank you for registering with us. To complete your registration, please set your password by following the link below:

            $resetLink

            If you did not register for our service, please ignore this email.

            Best regards,
            The [Your Service] Team
        """.trimIndent()
    }
}

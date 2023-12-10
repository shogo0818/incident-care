package com.example.incident.care.data

import java.time.LocalDateTime

data class BulletinPostData (
    val id: Int,
    val title: String,
    val content: String,
    val author: String,
    val timestamp: LocalDateTime
)
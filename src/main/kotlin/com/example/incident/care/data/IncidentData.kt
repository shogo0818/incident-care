package com.example.incident.care.data

import java.time.LocalDateTime

data class IncidentData(
    val id: Int,
    val title: String,
    val description: String,
    val reportedBy: String,
    val dateReported: LocalDateTime
)

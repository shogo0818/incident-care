package com.example.incident.care.controller

import com.example.incident.care.data.IncidentData
import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime


@RestController
@RequestMapping("/api/incidents")
class IncidentManagementController {

    private val mockIncidents = mutableListOf(
        IncidentData(1, "Network Outage", "The main router failed.", "Alice", LocalDateTime.now()),
        IncidentData(2, "Application Crash", "The inventory system crashed at 3 PM.", "Bob", LocalDateTime.now())
        // Add more incidents here
    )

    @GetMapping
    fun getAllIncidents(): List<IncidentData> {
        //本番環境ではデータベースからフェッチ
        return mockIncidents
    }

    @PostMapping
    fun registerIncident(@RequestBody incident: IncidentData): IncidentData {
        val newIncident = incident.copy(id = mockIncidents.size + 1, dateReported = LocalDateTime.now())
        mockIncidents.add(newIncident)
        return newIncident
    }

    // 検索、更新などのメソッドを追加できます。
}
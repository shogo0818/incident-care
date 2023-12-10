package com.example.incident.care.controller

import com.example.incident.care.data.BulletinPostData
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class BulletinBoardController {

    @GetMapping("/api/bulletin-board")
    fun getBulletinPosts(): List<BulletinPostData> {
        return listOf(
            BulletinPostData(1, "Server Down", "The main server is down since 3 PM.", "Alice", LocalDateTime.now()),
            BulletinPostData(2, "Scheduled Maintenance", "Scheduled maintenance on Friday at 10 PM.", "Bob", LocalDateTime.now()),
            // Add more mock posts here
        )
    }
}




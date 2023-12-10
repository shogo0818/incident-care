import com.example.incident.care.data.LoginData
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class ApiLoginController {

    private val mockUsers = listOf(
        LoginData(email = "tanaka@example.com", password = "password123"),
        LoginData(email = "nakamura@example.com", password = "password456"),
        LoginData(email = "kuniyoshi@example.com", password = "password789")
    )

    @PostMapping("/login")
    fun login(@RequestBody loginRequest: LoginData): ResponseEntity<String> {
        val userExists = mockUsers.any { it.email == loginRequest.email && it.password == loginRequest.password }
        return if (userExists) {
            ResponseEntity.ok("Login successful. Redirecting to top page.")
        } else {
            ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials.")
        }
    }
}

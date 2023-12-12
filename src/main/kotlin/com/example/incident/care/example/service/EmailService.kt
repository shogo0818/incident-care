import org.springframework.stereotype.Service

@Service
class EmailService(private val emailSender: JavaMailSender) {

    fun sendRegistrationEmail(to: String, token: String) {
        val message = SimpleMailMessage()
        message.setTo(to)
        message.setSubject("Complete Your Registration")
        message.setText("Please use the following link to complete your registration: http://localhost:8080/complete-registration?token=$token")
        emailSender.send(message)
    }
}

class SimpleMailMessage {
    fun setTo(to: String) {
        TODO("Not yet implemented")
    }

    fun setSubject(s: String) {
        TODO("Not yet implemented")
    }

    fun setText(s: String) {
        TODO("Not yet implemented")
    }

}

interface JavaMailSender {
    fun send(message: SimpleMailMessage)

}

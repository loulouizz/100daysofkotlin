package classes

import java.time.LocalDateTime

data class User(
        val id: Int,
        var name: String,
        var email: String,
) {

    override fun hashCode(): Int {
        return id + name.toByte() + email.toByte() + LocalDateTime.now().nano
    }
}

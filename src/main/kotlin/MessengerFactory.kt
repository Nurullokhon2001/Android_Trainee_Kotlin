import java.lang.RuntimeException

class MessengerFactory {
    fun createMessenger(messengerType: String) =
        when (messengerType) {
            "telegram", "Telegram" -> Telegram()
            "watsapp", "Watsapp", "WatsApp" -> WatsApp()
            else -> throw RuntimeException(
                "Messenger type not found"
            )
        }
}
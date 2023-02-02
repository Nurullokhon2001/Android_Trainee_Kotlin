package factory

import factory.Messengers.TELEGRAM

class MessengerFactory {
    fun createMessenger(messengerType: Messengers) =
        when (messengerType) {
            TELEGRAM -> Telegram()
            Messengers.WATSAPP -> WatsApp()
        }
}
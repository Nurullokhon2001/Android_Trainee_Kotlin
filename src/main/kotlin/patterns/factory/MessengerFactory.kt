package patterns.factory

import patterns.factory.Messengers.TELEGRAM

class MessengerFactory {
    fun createMessenger(messengerType: Messengers) =
        when (messengerType) {
            TELEGRAM -> Telegram()
            Messengers.WATSAPP -> WatsApp()
        }
}
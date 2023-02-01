fun main() {
    val factory = MessengerFactory()
    val messenger: Messenger = factory.createMessenger(Messengers.TELEGRAM)
    messenger.sendMessage()
}
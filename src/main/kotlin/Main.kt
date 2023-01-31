fun main() {
    val factory = MessengerFactory()
    val messenger: Messenger = factory.createMessenger("telegram")
    messenger.sendMessage()

}
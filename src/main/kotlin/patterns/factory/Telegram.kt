package patterns.factory

class Telegram : Messenger {
    override fun sendMessage() {
        println("Message send from telegram")
    }
}
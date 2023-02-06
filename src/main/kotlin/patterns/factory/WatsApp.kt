package patterns.factory

class WatsApp : Messenger {
    override fun sendMessage() {
        println("Message send from factory.WatsApp")
    }
}
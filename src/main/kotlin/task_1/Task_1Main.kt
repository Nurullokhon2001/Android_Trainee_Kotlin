package kotlin_intern

fun main() {
    println("Введите команду: ")
    while (true) {
        val scannerText : String = readln().trim()
        when (scannerText) {
            "/start" -> {
                println("Привет давайте начать работу")
            }

            "/help" -> {
                println("Команды для работы с программой: \n/start Старт программы\n/end завершить программу")
            }

            "/end" -> {
                println("Пока ... \n ")
                break
            }

            else -> {
                println("Упс Извините я не знаю такую команду \nдля просмотра команд введите команду /help")
            }
        }
    }
}
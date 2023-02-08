package task_2

import task_2.commands.Command

fun main() {
    println("Введите команду /start для запуска программы :")
    while (true) {
        val scanner = readln().substringBefore(" ")
        when (scanner) {
            Command.START.command -> {
                println("Добро пожаловать в парковку.")
                Manager.start()
            }

            Command.HELP.command -> {
                println("Команда /start  для старта программы. \n Команда /end  для завершении программы  ")
            }

            Command.END.command -> {
                break
            }

            else -> {
                Command.getCommand(scanner)
            }
        }
    }
}
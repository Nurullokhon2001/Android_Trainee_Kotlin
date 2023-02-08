package task_2

import task_2.models.Car
import task_2.models.CarOwner

fun main() {
    println("Введите команду: ")
    while (true) {
        val scannerText = readln().split(" ")

        when (scannerText[0]) {
            "/park" -> {
                val a = Car(scannerText[1], scannerText[2], scannerText[3], CarOwner(scannerText[4], scannerText[4]))
                println(a.toString())
            }
        }
    }
}
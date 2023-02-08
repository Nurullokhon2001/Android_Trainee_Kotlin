package task_2

import task_2.commands.Command
import task_2.models.Car
import task_2.models.CarOwner

object Manager {
    private val parking = Parking.create()
    fun start() {
        while (true) {
            val readText = readln()
            val command = readText.substringBefore(" ")
            val arguments = readText.substringAfter(" ").split(" ")

            when (command) {
                Command.START.command -> {
                    println("Программа уже запущена ")
                }

                Command.HELP.command -> {
                    println(
                        "/return -- возвращает автомобиль. " + "Важно возвращать автомобиль только владельцу," + " если автомобиль запрашивает другой человек, " + "возвращать ошибку \n" + "/park_info_by_car -- возвращает место, где припаркована машина, по ее номеру  \n" + "/park_info_by_place -- возвращает информацию о машине по месту на парковке  \n" + "/park -- паркует автомобиль на любое свободное место"
                    )
                }

                Command.PARK.command -> {
                    if (checkSize(command, arguments.size)) {
                        parkCar(Car(arguments[0], arguments[1], arguments[2], CarOwner(arguments[3], arguments[4])))
                    }
                }

                Command.PARK_INFO_BY_CAR.command -> {
                    if (checkSize(command, arguments.size)) {
                        parkInfoByCar(
                            Car(
                                arguments[0], arguments[1], arguments[2], CarOwner(arguments[3], arguments[4])
                            )
                        )
                    }
                }

                Command.PARK_INFO_BY_PLACE.command -> {
                    if (checkSize(command, arguments.size)) {
                        parkInfoByPlace(arguments[0].toInt())
                    }
                }


                Command.GET_CAR.command -> {
                    if (checkSize(command, arguments.size)) {
                        returnCar(arguments[0], CarOwner(arguments[1], arguments[2]))
                    }
                }

                Command.PARK_STATUS.command -> {
                    for (i in 1..20) {
                        print("P$i = ")
                        println((parking["P$i"]) ?: "Пусто ")
                    }
                }

                Command.END.command -> {
                    print("Вы вышли с парковки ")
                    print("Для закрытие программмы вызовите команду /end")
                    break
                }

                else -> {
                    Command.getCommand(command)
                }
            }
        }
    }

    private fun parkCar(car: Car) {
        for (i in 1..20) {
            if (parking["P$i"] == null) {
                parking["P$i"] = car
                println("Номер парковки: P$i")
                return
            }
        }
        println("На парковке больше нету мест ")
    }

    private fun returnCar(carNumber: String, carOwner: CarOwner) {
        for (i in 1..20) {
            if (parking["P$i"]?.carOwner == carOwner && carNumber == parking["P$i"]?.carNumber) {
                val place = parking.filterValues { it?.carOwner == carOwner }.keys.first()
                parking[place] = null
                return
            }
        }
        println("${carOwner.name} взял свою машину с парковки ")
    }

    private fun parkInfoByCar(car: Car) {
        for (i in 1..20) {
            if (parking["P$i"] == car) {
                println("Ваша машина припарковано в P$i")
                return
            }
        }
    }

    private fun parkInfoByPlace(placeNumber: Int) {
        for (i in 1..20) {
            if (i == placeNumber) {
                println("В парковке с номером P$i припарковано машина :" + parking["P$i"])
                return
            }
        }
    }

    private fun checkSize(command: String, infoSize: Int): Boolean {
        when (command) {
            Command.PARK.command, Command.PARK_INFO_BY_CAR.command -> {
                if (infoSize != 5) {
                    println("Неверный формат данных, попробуйте еще раз")
                    println(
                        "Необходимые параметры: \n" + "- Марка\n" + "- Цвет\n" + "- Номер\n" + "-Имя и Фамиля = владельца машины"
                    )
                    return false
                }
            }

            Command.GET_CAR.command -> {
                if (infoSize != 3) {
                    println("Неверный формат данных, попробуйте еще раз")
                    println(
                        "Необходимые параметры: \n" + "- Номер\n" + "-Имя и Фамиля = владельца машины"
                    )
                    return false
                }
            }

            Command.PARK_INFO_BY_PLACE.command -> {
                if (infoSize != 1) {
                    println("Неверный формат данных, попробуйте еще раз")
                    println(
                        "Необходимые параметры: \n" + "- Номер парковки\n"
                    )
                    return false
                }
            }
        }
        return true
    }
}
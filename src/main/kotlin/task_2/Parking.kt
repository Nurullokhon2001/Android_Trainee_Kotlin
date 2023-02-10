package task_2

import task_2.models.Car

object Parking {
    fun create(): MutableMap<String, Car?> {
        val parking = mutableMapOf<String, Car?>()
        for (i in 1..20) {
            parking["P$i"] = null
        }
        return parking
    }
}
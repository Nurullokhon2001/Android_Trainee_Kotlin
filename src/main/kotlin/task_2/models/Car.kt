package task_2.models

data class Car(
    val carMark: String,
    val carNumber: String,
    val carColor: String,
    val carOwner: CarOwner
) {
    override fun toString(): String {
        return " Марка машины: $carMark ," +
                "Номер машины : $carNumber ," +
                " Цвет машины: $carColor ," +
                " Владелец : ${carOwner.name + carOwner.surName}"
    }
}
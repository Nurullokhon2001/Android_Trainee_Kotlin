package task_2.commands

enum class Command(val command: String) {
    START("/start"),
    END("/end"),
    HELP("/help"),
    PARK("/park"),
    PARK_STATUS("/park_status"),
    GET_CAR("/return"),
    PARK_INFO_BY_CAR("/park_info_by_car"),
    PARK_INFO_BY_PLACE("/park_info_by_place");

    companion object {
        fun findCommand(value: String?): Command? = values().firstOrNull { it.command == value }
        fun getCommand(value: String?) = findCommand(value) ?: run {
            println("Команда $value не расспознанна для просмотра команд вызовите команду /help")
        }
    }
}
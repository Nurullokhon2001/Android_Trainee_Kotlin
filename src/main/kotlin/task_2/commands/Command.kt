package task_2.commands

enum class Command(command: String) {
    START("/start"),
    END("/end"),
    HELP("/help"),
    PARK("/park"),
    GET_CAR("/return"),
    PARK_INFO_BY_CAR("/park_info_by_car"),
    PARK_INFO_BY_PLACE("/park_info_by_place")
}
package patterns.builder

fun main() {
    val laptop: Builder = Laptop()
    laptop.cpu(CpuTypes.COREI3).build()
    println(laptop.toString())
}
package builder

interface Builder {
    fun ram(ram: Int): Builder
    fun displaySize(displaySize: Float): Builder
    fun cpu(cpu: CpuTypes): Builder
    fun build(): Builder
}
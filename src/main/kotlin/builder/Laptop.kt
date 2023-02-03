package builder

class Laptop(
    private var cpu: CpuTypes = CpuTypes.COREI7,
    private var ram: Int = 8,
    private var displaySize: Float = 14.3f,
) : Builder {

    override fun ram(ram: Int): Builder {
        this.ram = ram
        return this
    }

    override fun displaySize(displaySize: Float): Builder {
        this.displaySize = displaySize
        return this
    }

    override fun cpu(cpu: CpuTypes): Builder {
        this.cpu = cpu
        return this
    }

    override fun build() = Laptop(cpu, ram, displaySize)

    override fun toString(): String {
        return "Ram : $ram , \nDisplaySize : $displaySize , \nCpu : $cpu ,"
    }
}
package week03.org.gonzalez.patricio.week03.scenario07



open class Tool {

    //    var name: String = ""
//    override fun toString(): String {
//        return "Tool()"
//    }
    override fun toString() : String {
        return this::class.simpleName!!
    }
}
class Screwdriver : Tool() {
    override fun toString(): String {
        return "Screwdriver()"
    }
}
class Saw: Tool() {
    override fun toString(): String {
        return "Saw()"
    }
}

open class Toolbox {
    var tools = emptyList<Tool>()
        private set

    fun add(tool: Tool) { // A
        println("      Toolbox.add(tool)")
        tools = tools + tool
    }

    fun add(tool: Screwdriver) {  // B
        println("      Toolbox.add(screwdriver)")
        tools = tools + tool
    }

    open fun add(tool: Saw) {  // C
        println("      Toolbox.add(saw)")
        tools = tools + tool
    }
}

class SafeToolbox: Toolbox() {
    override fun add(tool: Saw) {   // D
        println("      SafeToolbox.add(Saw) -- adding safely!!!")
        super.add(tool)
    }
}

fun main() {
    val safeToolbox: SafeToolbox = SafeToolbox()
    println("Adding tools")

    safeToolbox.add(Saw()) // what will be called - add(tool) where is? // NOW IS D
    safeToolbox.add(Screwdriver())

    println(safeToolbox.tools)


}
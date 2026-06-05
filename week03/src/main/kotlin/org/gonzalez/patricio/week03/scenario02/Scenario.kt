package week03.org.gonzalez.patricio.week03.scenario02


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

class Toolbox {
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
}

fun main() {
    val toolbox = Toolbox()
    val saw: Tool = Saw()
    val saw2: Saw = Saw()
    val screwdriver: Tool = Screwdriver()
    val screwdriver2: Screwdriver = Screwdriver()

    println("adding saw")
    toolbox.add(saw)
    println("adding screwdriver")
    toolbox.add(screwdriver)

    println("adding saw2")
    toolbox.add(saw2)
    println("adding screwdriver2")
    toolbox.add(screwdriver2)

    println(toolbox.tools)

    // NOTE - calls toString() on each tool
    // toString() is intended for DEBUGGING, not to be user facing!
    // would give you one true way to display the data
}
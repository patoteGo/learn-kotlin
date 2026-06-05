package week03.org.gonzalez.patricio.week03.scenario03


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
    val tools = listOf(Saw(), Screwdriver())
    println("Adding tools")

    for (tool in tools) {
        toolbox.add(tool) // what is called here?
            // compile time signature is Toolbox.add(tool)
    }

    println(toolbox.tools)


}
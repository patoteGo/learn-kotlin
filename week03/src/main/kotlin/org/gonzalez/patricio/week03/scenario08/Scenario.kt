package week03.org.gonzalez.patricio.week03.scenario08

import kotlin.reflect.KClass


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

    var adders: MutableMap<KClass<*>, (Tool, List<Tool>) -> List<Tool>> = mutableMapOf()
        private set

    fun registerAdder(toolType: KClass<*>, adder: (Tool, List<Tool>) -> List<Tool>) {
        adders[toolType] = adder
    }

    fun add(tool: Tool) {
        tools = adders[tool::class]?.invoke(tool, tools) ?: tools
    }

}


fun main() {
    val toolbox: Toolbox = Toolbox()
    toolbox.registerAdder(Saw::class) {
        tool, tools ->
        println("Calling Saw adder")
        tools + tool
    }

    toolbox.registerAdder(Screwdriver::class) {
            tool, tools ->
        println("Calling Screwdriver adder")
        tools + tool
    }

    println("adding tools")

    toolbox.add(Saw())
    toolbox.add(Screwdriver())
    println(toolbox.tools)

}
package org.gonzalez.patricio.week0203

fun main() {
    val x = a()
    println(x)
    println(a())
    println(b1())
    println(b2())
    println(d1(1, 2))
    println(d2(1, 2))
    println(e1(1, 2, true, true, 10))

    println(g1("A"))
    println(g1("A", "B"))
    println(g1("A", "B", "C", "D","E","F"))

    // this is better when it got disorganized
    println(e1(
        a = 1,
        b = 2,
        isList = true,
        personExist = true,
        z = 10
    ))

    // i can skip beacuse i got defaults for the boolean parameters
    println(f1(
        a = 1,
        b = 2,
        z = 10
    ))

    g4b("A", "B", "C", "D", "E", x="F", y="G") // if varargs are early, need to name later params
    // recommend always put varargs last, esp for Java compatibility
}

fun a(): Int {
    return 10
}

// single expression function
fun b1(): Int = 10
fun b2() = 10

var n = 20
fun c1() = if (n < 10) 10 else 20 // equiv to java's ternary expression "n < 10 ? 10 : 20"
fun c2() =
    if (n < 10) {
        10
    } else {
        20
    }

fun c3(): Int {
    if (n < 10) {
        return 10
    } else {
        return 20
    }
}

fun c4(): Int {
    return if (n < 10) {
        10
    } else {
        20
    }
}

fun c5(): Int {
    return if (n < 10) 10 else 20
}

// parameters
fun d1(x: Int, y: Int) = x + y // single-expression function
   // NOTE - comma fter last parameter
   // in Math: d(x,y) = x + y

fun d2(
    x: Int,
    y: Int, // multi-line parameters - always add, after last parameter
) = x + y // single-expression function

fun e1(
    a: Int,
    b: Int,
    isList: Boolean,
    personExist: Boolean,
    z: Int,
) = a + b // single-expression function

@JvmOverloads // generate equiv Java overloads functions
fun f1(
    a: Int,
    b: Int,
    isList: Boolean = false,
    personExist: Boolean = false,
    z: Int,
) = a + b // single-expression function

fun g1(vararg items: String): String {
    var result = ""
    for( item in items) {
        result += "$item,"
    }
    return result
}

fun g2(vararg items: String): String {
//    return g1(items) // won't work - type mismatch
    return g1(*items) // works - spreads the argument out - spread operator - dont know the number of items needed
}

fun g1a (x: String, y: String, z: String) {
    println(x)
    println(y)
    println(z)
}

fun g3(vararg items: String) {
//    g1a(*items) // won't work
    g1a( items[0],  items[1],  items[2]) // works - know the number of items
}

fun g4a(x: Int, y: Int, vararg items: String) {

}

fun g4b( vararg items: String, x: String, y: String) {

}
// TODO fast fail

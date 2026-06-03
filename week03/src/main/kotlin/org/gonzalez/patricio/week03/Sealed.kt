package week03.org.gonzalez.patricio.week03

// fail-fast functions


fun a (n: Int, x: Int, y: Int) {
    if (n in 5 .. 10) {
        if ( x in 1 .. 10) {
            if ( y in 10 .. 100 ) {
                println("do somethinc (could it be very complex)")
            }
        }
    }
}

// fail-fast approach

fun failFastA (n: Int, x: Int, y: Int) {

    // less readable conditions
    //    if (!(n in 5..10)) return
    //    if(n < 5 || n > 10) return


    if (n !in 5 .. 10 ) return
    if (x !in 1 .. 10 ) return
    if (y !in 10 .. 100 ) return

    // typically did this as "single entry, single exit" approach
    println("do somethinc (could it be very complex)")
}
//
//fun failFastA2 (n: Int, x: Int, y: Int) {
//    if (n !in 5 .. 10 ) throw RuntimeException("n is bad")
//    if (x !in 1 .. 10 ) throw RuntimeException("x is bad")
//    if (y !in 10 .. 100 ) throw RuntimeException("y is bad")
//
//    // typically did this as "single entry, single exit" approach
//    println("do somethinc (could it be very complex)")
//}
//
//fun failFastA3 (n: Int, x: Int, y: Int) {
//    check( n in 5 .. 10) {"n is bad"}
//    if (n !in 5 .. 10 ) throw RuntimeException("n is bad")
//    if (x !in 1 .. 10 ) throw RuntimeException("x is bad")
//    if (y !in 10 .. 100 ) throw RuntimeException("y is bad")
//
//    // typically did this as "single entry, single exit" approach
//    println("do somethinc (could it be very complex)")
//}
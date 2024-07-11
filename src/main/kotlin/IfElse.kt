//CONTROL STRUCTURE

fun main(args: Array<String>) {
    //1. Write code if/else
    val a: Int = 5
    val b: Int = 2
    var max: Int

    if (a > b) {
        max = a
    } else {
        max = b
    }

    //As expression (ternary)
    val max2 = if (a > b) a else b

    //2. Write code if/else using WHEN
    val x: Int = 5
    when (x) {
        1 -> {
            println("case 1")
        }
        2 -> {
            println("case 2")
        }
        else -> {
            println("Not case 1 or not case 2")
        }
    }
}
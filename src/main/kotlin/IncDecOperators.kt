fun main() {
//    ++ and --
    var number = 10
    println(++number) // 11
    println(number++) // 11
    println(number) // 12
    println(--number) // 11
    println(number--) // 11
    println(number) // 10
    number.plus(1) //11 -> this way is recommended by Kotlin
    number.minus(1) //10
}
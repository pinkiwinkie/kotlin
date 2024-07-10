fun main() {
    //1. Declaration of variables only indicating the value
    var n = 10
    var l = 100L
    var d = 3.14
    var f = 3.14F
    var b = false // kotlin deduces the boolean data type from the value
    var s = "Amigoscode" // kotlin deduces the string data type from the value
    var c = 'A'

    //3. Declaration of variables only indicating the type
    val x: Int
    val isBlue: Boolean
    val surnames: String

    //4. Try to modify some previous variable
        //surnames = "hola" -> This causes a compile time error
        // * explained at ValvsVar.kt *

    //5. Try to assign null to some variable
        //val marca: String = null -> This causes a compile time error
        // * explained at Nulls.kt *
}
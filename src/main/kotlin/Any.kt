// The Any type is what Object a Java
// Any is the supertype of all types in Kotlin
fun main() {
    //1. Create different variables of type Any
    var number: Any = 'c'
    var name: Any = "Jamila"

    //2. Create different variables of type Any?
    val y: Any? = 2
    val surnames: Any? = null
    val numbers = listOf<Any>(15, "20", 30.5, "cien")

    // In short, Object is the super class of all classes in Java, while,
    // Any is the super class of all NON-OPTIONAL classes in Kotlin
    // Any? If we also want to use the null value
}


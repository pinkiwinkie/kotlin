//Optional data types: Null Safety.
//Null Safety is the property by which Kotlin helps us manage the use of null values
fun main() {
    //1. Declare a non-null variable
    var neverNull: String = "This variable is never null"

    //2. Compilation error when trying to assign null to a non-null variable
    // neverNull = null

    //3. Declare a String variable that can be null
    var name: String? = "Helena"

    //4. Assigns a null value to name
    name = null // unlike point 2, there is no compilation error here

    //5. What happens if we do not indicate the type?
    var surnames = "kotlin deduces that this variable cannot be null"

    //6. Try assigning null to the surnames variable
    // surnames = null -> Compilation error

    //7. Try declaring other data types Null Safety
    var age: Int? = null
    age = 15
    var height: Double? = 30.0

    //8. What is Null Safety for in Kotlin?
        // As its name suggests, this serves to ensure that the types of data we manipulate
        // may or may not be null, this Kotlin property is a highly recommended practice and
        // which helps improve the quality of the code we write
}
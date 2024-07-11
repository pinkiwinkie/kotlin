//Optional data types: Null Safety.
//Null Safety is the property by which Kotlin helps us manage the use of null values
fun main() {
    //1. Declara una variable no null
    var neverNull: String = "Esta variable nunca es nula"

    //2. Error de compilación al intentar asignar null a una variable no nula
    // neverNull = null

    //3. Declara una variable String que pueda ser nula
    var name: String? = "Helena"

    //4. Asigna un valor nulo a name
    name = null // a diferencia del punto 2, aquí no hay error de compilación

    //5. Qué pasa si no indicamos el tipo?
    var surnames = "kotlin deduce que esta variable no puede ser null"

    //6. Intenta asignar null a la variable surnames
    // surnames = null -> esto provoca un error de compilación

    //7. Intenta declarar otros tipos de datos Null Safety
    var age: Int? = null
    age = 15
    var height: Double? = 30.0

    //8. Para qué sirve Null Safety en kotlin?
        // Tal y como su nombre indica, esto sirve para asegurarnos de que los tipos de datos que manipulamos
        // puedan ser null o no, esta propiedad de kotlin es una práctica muy recomendada y
        // que ayuda a mejorar la calidad del código que escribimos
}
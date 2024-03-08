const val maxAge = 125

fun main() {
    val immutableAge: Int
    var age: Int
    age = 50
    immutableAge = 23
    println("Hello world, this is Kotlin.")
    println("Below is immutable age:")
    println(immutableAge)
    println("Below is mutable age:")
    println(age)
    age = 100
    println("Below is CHANGED mutable age:")
    println(age)
    println("Below is maximum allowed age:")
    println(maxAge)
    print("Enter your string: ")
    val inputString = readLine()
    println("Your string: " + inputString)
    if (immutableAge == 23) {
        println("Condition of immutable age met. Below is immutable age:")
        println(age)
    } else {
        println("Condition of immutable age is NOT met.")
    }

    val doubleVal: Double = 1.78
    val floatVal: Float = 1.78F
    val booleanVal: Boolean = true

    val character: Char = 'A'
    val str: String = "String"
    val longstr: String = "This is a $str"

    val anyTypeVal: Any

    val isEnabled = true
    when(isEnabled){
        false -> println("isEnabled off")
        true -> println("isEnabled on")
        else -> println("wrong value type")
    }

    

}
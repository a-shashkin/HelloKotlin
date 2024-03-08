fun main() {
    helloWorld()
    showMeAMessage("Good to see you!")
    displayUser("Alexander", 30, "QA Fullstack")
    printStrings("Java", "Kotlin", "Selenide", "Kaspresso", "Android Studio")
    printStrings("Swift", "Xcode")
    sumOfInts(3, 5, 15, 100)
    printUserGroup("KT-091", "Tom", "Bob", "Alice", count=3)
    val arrayOfNumbers = intArrayOf(1, 2, 3, 4, 5)
    changeNumbers(*arrayOfNumbers, koef = 2)
    additionOfNumbers(2, 3)
    square(6)
    val message: () -> Unit
    message = ::helloWorld
    message()
    var operation: (Int, Int) -> Int = ::sum
    val result = operation(3, 5)
    operation = ::subtract
    val secondResult = operation(10, 1)
    displayMessage(::morning)
    displayMessage(::evening)
    val action1 = selectAction(1)
    println(action1(8,5))
    val action2 = selectAction(2)
    println(action2(8,5))

    val printer = {message: String -> println(message)}
    printer("Hello")
    printer("Good Bye")
}

fun helloWorld() {
    println("Hello, world!")
}

fun sum(a: Int, b: Int): Int{
    return a + b
}

fun subtract(a: Int, b: Int): Int{
    return a - b
}

fun empty (a: Int, b: Int): Int{
    return 0
}

fun multiply(a: Int, b: Int): Int{
    return a * b
}

fun showMeAMessage(message: String){
    println(message)
}

fun displayUser(name: String, age: Int, position: String = "Unemployed"){
    println("Name: $name   Age: $age")
}

fun printStrings(vararg strings: String){
    for(str in strings)
        println(str)
}

fun sumOfInts(vararg numbers: Int){
    var result = 0
    for(n in numbers)
        result += n
    println("Сумма чисел равна $result")
}

fun printUserGroup(group: String, vararg users: String, count:Int){
    println("Group: $group")
    println("Count: $count")
    for(user in users)
        println(user)
}

fun changeNumbers(vararg numbers: Int, koef: Int){
    for(number in numbers)
        println(number * koef)
}

fun additionOfNumbers (x: Int, y: Int): Int {
    return x + y
}

fun square(x: Int) = x * x

fun compareAge(age1: Int, age2: Int){

    fun ageIsValid(age: Int)= age > 0 && age < 111

    if( !ageIsValid(age1) || !ageIsValid(age2)) {
        println("Invalid age")
        return
    }

    when {
        age1 == age2 -> println("age1 == age2")
        age1 > age2 -> println("age1 > age2")
        age1 < age2 -> println("age1 < age2")
    }
}

fun displayMessage(mes: () -> Unit){
    mes()
}
fun morning(){
    println("Good Morning")
}
fun evening(){
    println("Good Evening")
}

fun selectAction(key: Int): (Int, Int) -> Int{
    // определение возвращаемого результата
    when(key){
        1 -> return ::sum
        2 -> return ::subtract
        3 -> return ::multiply
        else -> return ::empty
    }
}
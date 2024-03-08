fun main() {
    helloWorld()
    showMeAMessage("Good to see you!")
    displayUser("Alexander", 30, "QA Fullstack")
    printStrings("Java", "Kotlin", "Selenide", "Kaspresso", "Android Studio")
    printStrings("Swift", "Xcode")
}

fun helloWorld() {
    println("Hello, world!")
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
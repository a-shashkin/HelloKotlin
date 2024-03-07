fun main() {

    for (n in 1..10) {
        println(n)
    }

    for(i in 1..9){
        for(j in 1..9){
            print("${i * j} \t")
        }
        println()
    }

    showMessage("Hello Kotlin")
    showMessage()
}

fun showMessage(message : String = "No message") {
    println(message)
}
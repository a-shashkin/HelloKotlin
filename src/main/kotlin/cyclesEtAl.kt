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

    var counter: Int = 10
    while (counter > 0) {
        println(counter)
        counter--
    }

    var secondCounter: Int = 10
    do {
        println(counter)
        counter--
    } while (secondCounter > 0)

    for (n in 1..8) {
        if(n == 5) continue
        println(n * n)
    }

    for (n in 1..5) {
        if(n == 5) break
        println(n * n)
    }

    showMessage("Hello Kotlin")
    showMessage()
}

fun showMessage(message : String = "No message") {
    println(message)
}
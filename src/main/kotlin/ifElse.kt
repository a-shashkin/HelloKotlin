fun main() {
    val a: Int = 10

    if(a == 10) {
        println("а равно 10")
    }

    val b: Int = 20

    if(b == 10) {
        println("b равно 10")
    } else {
        println("b не равно 10")
    }

    when(b){
        10, 20 -> println("b = 10 или b = 20")
        else -> println("неопределенное значение")
    }

    val isEnabled = true
    when(isEnabled){
        false -> println("isEnabled off")
        true -> println("isEnabled on")
    }

    val sum = 1000

    val rate = when(sum){
        in 100..999 -> 10
        in 1000..9999 -> 15
        else -> 20
    }
    println("rate equals $rate")
}
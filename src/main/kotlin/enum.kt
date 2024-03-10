enum class Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum class anotherDay(val value: Int){
    MONDAY(1), TUESDAY(2), WEDNESDAY(3),
    THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(100500)
}

enum class yetAnotherDay(val value: Int){
    MONDAY(1), TUESDAY(2), WEDNESDAY(3),
    THURSDAY(4), FRIDAY(5), SATURDAY(6),
    SUNDAY(7);
    fun getDuration(day: yetAnotherDay): Int{
        return value - day.value;
    }
}

enum class Operation{

    ADD, SUBTRACT, MULTIPLY
}
fun operate(n1: Int, n2: Int, op: Operation): Int{

    when(op){
        Operation.ADD -> return n1 + n2
        Operation.SUBTRACT -> return n1 - n2
        Operation.MULTIPLY -> return n1 *n2
    }
}

fun main() {

    val day: Day = Day.FRIDAY
    println(day)
    println(Day.MONDAY)

    val secondDay: anotherDay = anotherDay.FRIDAY
    println(secondDay.value)
    println(anotherDay.MONDAY.value)

    val day1: yetAnotherDay = yetAnotherDay.FRIDAY
    val day2: yetAnotherDay = yetAnotherDay.MONDAY
    println(day2.getDuration(day2))

    println(operate(5, 6, Operation.ADD))         // 11
    println(operate(5, 6, Operation.SUBTRACT))   // -1
    println(operate(5, 6, Operation.MULTIPLY))   // 30
}
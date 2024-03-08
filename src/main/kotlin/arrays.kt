fun main() {

    val arrayOfInts: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val secondNumberFromArray = arrayOfInts[1]
    arrayOfInts[2] = 10

    for (i in arrayOfInts) {
        println(i)
    }

    var counter = 0
    while (counter in arrayOfInts.indices) {
        println(arrayOfInts[counter])
        counter++
    }

    val twoDimensionalArrayOfInts: Array<Array<Int>> = Array(3, { Array(5, {0}) })
    twoDimensionalArrayOfInts[0] = arrayOf(1, 2, 3, 4, 5)
    twoDimensionalArrayOfInts[1] = arrayOf(6, 7, 8, 9, 10)
    twoDimensionalArrayOfInts[2] = arrayOf(11, 12, 13, 14, 15)

    twoDimensionalArrayOfInts[0][1] = 0

    for (i in twoDimensionalArrayOfInts) {
        for (j in i) {
            print("$j \t")
        }
    }
}
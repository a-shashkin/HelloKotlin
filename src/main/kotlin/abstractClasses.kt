abstract class Human(val name: String){

    abstract var age: Int

    fun hello(){
        println("My name is $name")
    }
}
class nonAbstractPerson(name: String): Human(name) {
    override var age : Int = 1
}

// абстрактный класс фигуры
abstract class Figure {
    // абстрактный метод для получения периметра
    abstract fun perimeter(): Float

    // абстрактный метод для получения площади
    abstract fun area(): Float
}
// производный класс прямоугольника
class Rectangle(val width: Float, val height: Float) : Figure()
{
    // переопределение получения периметра
    override fun perimeter(): Float{
        return width * 2 + height * 2;
    }
    // переопрелеление получения площади
    override fun area(): Float{
        return width * height;
    }
}

fun main() {
    val nonAbstractOne: nonAbstractPerson = nonAbstractPerson("One")
}
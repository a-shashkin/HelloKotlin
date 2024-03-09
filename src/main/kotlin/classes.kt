fun main() {

    val bob: Person = Person()

    bob.name = "Bob"
    bob.age = 25

    println(bob.name)
    println(bob.age)
    bob.sayHello()
    bob.go("work")
    bob.personToString()

    val alice: typePerson = typePerson("Alice")

    val charles: anotherTypePerson = anotherTypePerson("Charles", 30)
}

class Person {
    var name: String = "Undefined"
    var age: Int = 18

    fun sayHello(){
        println("Hello, my name is $name")
    }

    fun go(location: String){
        println("$name goes to $location")
    }

    fun personToString() : String{
        return "Name: $name  Age: $age"
    }
}

class typePerson(_name: String) {
    val name: String
    init {
        name = _name
    }
}

class anotherTypePerson(_name: String){
    val name: String = _name
    var age: Int = 0

    constructor(_name: String, _age: Int) : this(_name){
        age = _age
    }
}
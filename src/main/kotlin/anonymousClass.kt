fun main() {

    val tom = object : anonymousPerson("Tom"){

        val company = "JetBrains"
        override fun sayHello(){
            println("Hi, my name is $name. I work in $company")
        }
    }

    tom.sayHello()  // Hi, my name is Tom. I work in JetBrains

    hello(
        object : anonymousPerson("Sam"){
            val company = "JetBrains"
            override fun sayHello(){
                println("Hi, my name is $name. I work in $company")
            }
        }
    )
}

fun hello(anonymousPerson: anonymousPerson){
    anonymousPerson.sayHello()
}

open class anonymousPerson(val name: String){
    open fun sayHello(){
        println("Hi, my name is $name")
    }
}
var age: Int = 18
    set(value){
        if((value>0) and (value <110))
            field = value
    }
    get(){
        println("Call getter")
        return field
    }

open class privatePerson(open var name: String){

    private var _age = 1
    var age: Int
        set(value){
            if((value > 0) and (value < 110))
                _age = value
        }
        get()=  _age
}

class privateEmployee(name: String): privatePerson(name) {
    override var name: String = "employee"
}

fun main() {
    val tom: privatePerson = privatePerson("Tom")

}
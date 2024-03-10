class nestedPerson(username: String, password: String){

    private val account: Account = Account(username, password)

    private class Account(val username: String, val password: String)

    fun showAccountDetails(){
        println("UserName: ${account.username}  Password: $account.password")
    }
}

class BankAccount(private var sum: Int){

    fun display(){
        println("sum = $sum")
    }

    inner class Transaction(private var sum: Int){
        fun pay(){
            this@BankAccount.sum -= this@Transaction.sum
            display()
        }
    }
}


fun main() {

    val tom = nestedPerson("qwerty", "123456");
    tom.showAccountDetails()

    val acc = BankAccount(3400);
    acc.Transaction(2500).pay()
}
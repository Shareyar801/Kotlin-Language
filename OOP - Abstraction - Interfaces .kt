//CODE 4 INTERFACES, RANDOM, DATE & TIME: 
import java.time.LocalDateTime
import java.util.Random

interface Itransaction
{
    fun showTransaction()
    fun getAmount()
}

class Transaction: Itransaction
{
    //In Kotlin, the lateinit keyword is used for those variables which are initialized after the declaration or we can say that the variable which is late initialized is called a lateinit variable.
    private var tCode:String
    private var date:String
    private var amount:Double

    constructor()
    {
        val ran = Random()
        tCode = "SNA" + ran.nextInt(1000).toString()
        date = LocalDateTime.now().toString()
        amount = 118.51
    }

    override fun showTransaction() {
        println("""Transaction Record: 
            Product: Petrol
            Price paid: $amount
            Product Code: $tCode
            Date & time: $date
        """.trimIndent())
    }
    override fun getAmount() {
        println("\nAmount has been paid through online payment for Product.")
    }
}
fun main()
{
    val trans = Transaction()
    println()
    trans.showTransaction()
    trans.getAmount()

}

/*OUTPUT: 
Transaction Record: 
            Product: Petrol
            Price paid: 118.51
            Product Code: SNA230
            Date & time: 2021-07-27T01:33:38.629864800

Amount has been paid through online payment for Product.*/

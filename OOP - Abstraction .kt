//CODE 4 ABSTRACTION: 
abstract class Calculator { abstract fun cal(N1:Int, N2:Int): Int }

class add(): Calculator() { override fun cal(N1: Int, N2: Int): Int { return  N1 + N2} }
class sub(): Calculator() { override fun cal(N1: Int, N2: Int): Int { return  N1 - N2} }
class mul(): Calculator() { override fun cal(N1: Int, N2: Int): Int { return  N1 * N2} }

fun main()
{
    val x1:Calculator = add()
    val x2:Calculator = sub()
    val x3:Calculator = mul()

    println("\nSum of Two: " + x1.cal(590,720))
    println("Sub of Two: " + x2.cal(590,720))
    println("Mul of Two: " + x3.cal(590,720))
}

/*OUTPUT: 
Sum of Two: 1310
Sub of Two: -130
Mul of Two: 424800*/

//CODE FOR FUNCTIONS, WHEN & ARRAY (MASTER CODE):
import kotlin.math.sin
import kotlin.math.cos
import kotlin.math.tan
import kotlin.math.log10
import java.util.Scanner

//PARAMETER-LESS FUNCTION EXAMPLE PERFORMING ADDITION.
fun additionOfthree(): Int
{
    val var_4_add = arrayOf(100,127,821)
    var sum = 0

    for (sf in 0 until var_4_add.size-1)        // .. & until are same 
        sum += var_4_add[sf]

    print("3 values are: ")
    for (sf in 0..var_4_add.size-1)
        print(" "+ var_4_add[sf])
    return sum
}

//PARAMETER FUNCTION EXAMPLE PERFORMING SUBTRACTION.
fun subtractionOfthree(s1: Double, s2: Double, s3: Double): Float
{
    val sub: Float
    sub = (s1 - s2 - s3).toFloat()
    println("3 values are: $s1 $s2 $s3")

    return sub
}

//DEFAULT ARGUMENT FUNCTION EXAMPLE PERFORMING MULTIPLICATION.
fun multiplicationOfthree(m1:Double, m2:Double, m3: Int = 58): Double
{
    val mul: Double
    mul = m1 * m2 * m3
    println("3 values are: $m1 $m2 $m3")

    return mul
}

//NAMED ARGUMENTS FUNCTION EXAMPLE PERFORMING DIVISION.
fun divisionOf3(d1:Double, d2:Double, d3: Double): Double
{
    val div: Double
    div = (d1 / d2 / d3)
    println("3 values are: $d1 $d2 $d3")

    return div
}

//SINGLE EXPRESSION FUNCTION EXAMPLE FOR REMAINDER.
fun remainderOf2(r1:Int, r2:Int) = println("2 values are: $r1 $r2 \nremainder =  " + (r1 % r2))


//ANONYMOUS FUNCTION LITERALS EXAMPLE FOR LOG OF 10
var logOf10 = fun (l1: Float)
{
    println("Log of $l1 = " + log10(l1))
}


//LAMBDA EXPRESSION FUNCTION LITERALS EXAMPLE FOR SIN COS TAN.
var sincostanofnum = {s1: Int, c1: Float, t1: Float -> println("Sin $s1 = "+ sin(s1.toFloat()) +" Cos $c1 = " + cos(c1) + " Tan $t1 = " + tan(t1)) }


fun method_decider (when_choice: Int)
{
    when (when_choice)
    {
        1 ->   { println("\nCALLING PARAMETER-LESS FUNCTION EXAMPLE PERFORMING ADDITION.")
                 println("\nsum = " + additionOfthree())                                      }

        2 ->   { println("\nCALLING PARAMETER FUNCTION EXAMPLE PERFORMING SUBTRACTION.")
                 println("subtract = " + subtractionOfthree(5871.55,18.93,938.99))  }

        3 ->   { println("\nCALLING DEFAULT ARGUMENT FUNCTION EXAMPLE PERFORMING MULTIPLICATION.")
                    println("multi = " + multiplicationOfthree(24.0,71.89))           }

        4 ->   { println("\nCALLING NAMED ARGUMENTS FUNCTION EXAMPLE PERFORMING DIVISION")
                 println("divi = " + divisionOf3(d2= 25.77,d3=5.69,d1=1000.00))                }

        5 ->   { println("\nCALLING SINGLE EXPRESSION FUNCTION EXAMPLE FOR REMAINDER.")
                 remainderOf2(r1= 11,r2=3)                                                     }

        6 ->   { println("\nCALLING ANONYMOUS FUNCTION LITERALS EXAMPLE FOR LOG OF 10.")
                 logOf10(25.848F)                                                              }

        7 -> { println("\nCALLING LAMBDA EXPRESSION FUNCTION LITERALS EXAMPLE FOR SIN COS TAN.")
               sincostanofnum(66, 99.9F, 28.2F)                                                }

        else -> println("INVALID CHOICE TRY AGAIN")
    }
}

fun main()
{
    do {
        print("\nEnter your choice (1 to 6): ")
        val ch = Integer.valueOf(readLine())
        method_decider(ch)

        print("End loop press e: ")
        val exit = Scanner(System.`in`).next().single()

    }while (exit != 'e')
}

/*OUTPUT:
Enter your choice (1 to 7): 9
INVALID CHOICE TRY AGAIN
End loop press e: m

Enter your choice (1 to 7): 1

CALLING PARAMETER-LESS FUNCTION EXAMPLE PERFORMING ADDITION.
3 values are:  100 127 821
sum = 227
End loop press e: r

Enter your choice (1 to 7): 2

CALLING PARAMETER FUNCTION EXAMPLE PERFORMING SUBTRACTION.
3 values are: 5871.55 18.93 938.99
subtract = 4913.63
End loop press e: r

Enter your choice (1 to 7): 3

CALLING DEFAULT ARGUMENT FUNCTION EXAMPLE PERFORMING MULTIPLICATION.
3 values are: 24.0 71.89 58
multi = 100070.88
End loop press e: r

Enter your choice (1 to 7): 4

CALLING NAMED ARGUMENTS FUNCTION EXAMPLE PERFORMING DIVISION
3 values are: 1000.0 25.77 5.69
divi = 6.819826326302775
End loop press e: r

Enter your choice (1 to 7): 5

CALLING SINGLE EXPRESSION FUNCTION EXAMPLE FOR REMAINDER.
2 values are: 11 3 
remainder =  2
End loop press e: r

Enter your choice (1 to 7): 6

CALLING ANONYMOUS FUNCTION LITERALS EXAMPLE FOR LOG OF 10.
Log of 25.848 = 1.412427
End loop press e: r

Enter your choice (1 to 7): 7

CALLING LAMBDA EXPRESSION FUNCTION LITERALS EXAMPLE FOR SIN COS TAN.
Sin 66 = -0.026551154 Cos 99.9 = 0.80745953 Tan 28.2 = -0.07447033
End loop press e: e*/

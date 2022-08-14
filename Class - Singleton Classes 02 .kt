//CODE 4 SINGLETON CLASS:

object Structures
{
    init {
        println("Singleton class has been accessed!\n")
    }

    infix fun downwards_right_angle_tri(rows : Int)
    {
        print("Printing Downwards right angle triangle:\n")
        for (sf in rows downTo 1)
        {
            for (sf2 in sf downTo 1)
            {    print("*")
            }
            println()
        }
    }

    fun square(rows: Int)
    {
        println("Printing a square: ")
        for (sf in 1..rows) {
            for (sf2 in 1..rows)
                print("+")
            println()
        }
    }
}

fun main(args: Array<String>)
{
    Structures downwards_right_angle_tri 6      // without infix key it would be Structures.downwards_right_angle_tri(6)
    println()
    Structures.square(5)
}

/*OUTPUT:
Singleton class has been accessed!

Printing Downwards right angle triangle:
******
*****
****
***
**
*

Printing a square: 
+++++
+++++
+++++
+++++
+++++*/

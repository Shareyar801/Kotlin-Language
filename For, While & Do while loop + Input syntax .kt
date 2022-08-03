//CODE 4 FOR, WHILE & DO WHILE LOOP:
import java.util.Scanner
fun main()
{
    // TASK 01: PRINT TABLE OF USER-PROVIDED NUMBER FROM 1 TO 4 USING AND FOR LOOP
    print("Enter number for finding its table: ")
    val num1 = Integer.valueOf(readLine())

    for (sf in 1..4)		// .. IS A RANGE OPERATOR TO SET RANGE OF ANY CONDITION
    {
        println("$num1 * $sf = " + sf*num1)
    }

    // TASK 02: FINDING VALUES DIVISIBLE BY USER-PROVIDED NUMBER FROM 1 TO 30 USING IF ELSE & WHILE LOOP
    var sf = 1
    print("\nEnter number to find its divisible numbers from 1 to 30: ")
    val num2 = Integer.valueOf(readLine())

    while (sf <= 30)
    {
        if (num2 % sf == 0)
        {
            println("$sf is divisible with $num2.")
        }
        sf++
    }

    // TASK 03: CHECK THAT A USER-PROVIDED NUMBER IS EVEN OR ODD USING DO WHILE LOOP & WHEN
    var ch : Char

    do {
        print("\nEnter number to find weather its even or odd: ")
        val num3 = Integer.valueOf(readLine())

        if (num3 % 2 == 0)
            println("Entered num is even.")
        else
            println("Entered num is odd.")

        print("\nDo you want to end loop? Enter 'e' or 'E':")
        ch = Scanner(System.`in`).next().single()

    }while ((ch != 'e') && (ch != 'E'))

}

/*OUTPUT:
Enter number for finding its table: 7
7 * 1 = 7
7 * 2 = 14
7 * 3 = 21
7 * 4 = 28

Enter number to find its divisible numbers from 1 to 30: 12
1 is divisible with 12.
2 is divisible with 12.
3 is divisible with 12.
4 is divisible with 12.
6 is divisible with 12.
12 is divisible with 12.

Enter number to find weather its even or odd: 9847210
Entered num is even.

Do you want to end loop? Enter 'e' or 'E':y

Enter number to find weather its even or odd: 24711016
Entered num is even.

Do you want to end loop? Enter 'e' or 'E':*/

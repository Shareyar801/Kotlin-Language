//CODE 4 MULTI LINE STRING, INIT & CONSTRUCTOR, RECURSIVE FUNCTION: 

import kotlin.system.exitProcess

val end_program =
    {
            out: Boolean ->
        if (out == true)
            println("Program is Ended")
        exitProcess(1)
    }

class student (val name: String, val roll_no: String, val section: Char, val semester: Int)         //CONSTRUCTOR 4 PARAMETERS
{
    init                //CONSTRUCTOR 4 DEFAULT TASKS THAT HAVE TO BE PERFORMED
    {                   //Raw String or multi line string
        println("""
            |Student Logged In
            |Name: $name
            |Roll no: $roll_no
            |Section: $section
            |Semester: $semester
        """.trimMargin())
    }

    var gpa_ave = fun (sub_gpa01:Float, sub_gpa02:Float, sub_gpa03:Float,): Float { return ((sub_gpa01+sub_gpa02+sub_gpa03) / 3) }
}

class teacher (val name: String, val regis_no: String, val sub: String, val sal: Int)
{
    init                //CONSTRUCTOR 4 DEFAULT TASKS THAT HAVE TO BE PERFORMED
    {                   //Raw String or multi line string
        println("""
            |Teacher Logged In
            |Name: $name
            |Registration no: $regis_no
            |Subject: $sub
            |Salary: $sal
        """.trimMargin())
    }

    var attendance_marker = fun ()
    {
        val attendance =  true

        if (attendance)
            println("Attendence is Marked")
    }
}

fun program ()
{
    val pass4stu = "STU101"; val pass4tea = "TEA101"

    print("Enter user pass: ")
    var user_pass = readLine()
    println()

    while ((user_pass != "STU101") || (user_pass != "TEA101"))
    {
        if (user_pass == "STU101")
        {
            var stu = student("Shareyar", "2020F-BIT-2021", 'A', 2)
            println("Average GPA: ${stu.gpa_ave(3.66F, 3.00F, 4F)}")
            print("\nDo you want to logout? If yes press 1: ")
            val logout_flag = Integer.valueOf(readLine())

            if (logout_flag == 1)
                end_program(true)
            else
                program()	//RECURSIVE FUNCTION IS TAKING PLACE
        }

        else if (user_pass == "TEA101")
        {
            var tea = teacher("Nehal Sheikh Ahmed", "2015-1597-CS", "OOP", 90000)
            tea.attendance_marker()
            print("\nDo you want to logout? If yes press 1: ")
            val logout_flag = Integer.valueOf(readLine())

            if (logout_flag == 1)
                end_program(true)
            else
                program()   //recursive action.
        }
    }
}

fun main ()
{
    program()
}

/*OUTPUT: 
Enter user pass: TEA101

Teacher Logged In
Name: Nehal Sheikh Ahmed
Registration no: 2015-1597-CS
Subject: OOP
Salary: 90000
Attendence is Marked

Do you want to logout? If yes press 1: 0
Enter user pass: STU101

Student Logged In
Name: Shareyar
Roll no: 2020F-BIT-2021
Section: A
Semester: 2
Average GPA: 3.5533333

Do you want to logout? If yes press 1: 1
Program is Ended*/

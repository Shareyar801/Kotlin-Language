//CODE FOR INNER OUTER CLASS

class Human (var name: String, var age: Int)
{
    //INNER CLASS CAN ACCESS DATA OF OUTER CLASS
    inner class worker(val depart: String, val job_status: String)
    {
        var salary: Int = 0

        fun sal_determiner()
        {
            if (depart == "IT")
                salary = 120500

            else if (depart == "Sales")
                salary = 90000

            else if (depart == "Marketing")
                salary = 88000

            else if (depart == "Management")
                salary = 140000

            else
                salary = 60000
        }

        fun data_presenter()
        {
            sal_determiner()

            println("""
                |
                |Employee Data:
                |Name: $name 
                |Age: $age
                |Department: $depart 
                |Salary: $salary
                |Job status: $job_status
            """.trimMargin())
        }
    }

    //TWO INNER CLASSES CAN'T ACCESS DATA OF EACH OTHER CLASSES
    inner class student(val class_num: String, val sec: Char)
    {
        private fun average_finder(m1: Int, m2: Int, m3: Int): Float
        {
            var float = ((m1+m2+m3)/3).toFloat()
            return  float
        }

        fun data_presenter(m1: Int, m2: Int, m3: Int)
        {
            println("""
                |
                |Student data: 
                |Name: $name 
                |Age: $age
                |Section: $sec 
                |Average Marks: ${average_finder(m1, m2, m3)}
            """.trimMargin()
            )
        }
    }
}
fun main ()
{
    //INNER CLASS ACTS LIKE NON STATIC CLASS
    //We have to create an instance of the outer class else we can’t use inner classes.
    val man1 = Human("Shareyar Farooqui", 20)
    val man2 = Human("Nehal Ahmed Sheikh", 19)

    man1.student("10th", 'A').data_presenter(87, 78, 69)
    man1.worker("IT", "Active").data_presenter()

    man2.student("12th", 'A').data_presenter(77, 81, 60)
    man2.worker("Management", "Not active").data_presenter()

}

/*OUTPUT: 
Student data: 
Name: Shareyar Farooqui 
Age: 20
Section: A 
Average Marks: 78.0

Employee Data:
Name: Shareyar Farooqui 
Age: 20
Department: IT 
Salary: 120500
Job status: Active

Student data: 
Name: Nehal Ahmed Sheikh 
Age: 19
Section: A 
Average Marks: 72.0

Employee Data:
Name: Nehal Ahmed Sheikh 
Age: 19
Department: Management 
Salary: 140000
Job status: Not active*/

//CODE 4 INHERITANCE WITH CONSTRUCTORS: 
open class employee
{
    constructor(name: String, age: Int)
    {
        println("Employee")
        println("Name: $name")
        println("Age: $age")
    }
}
class IT: employee
{
    constructor(name: String, age: Int, pos: String, sal: Int): super (name, age)
    {
        println("""Position: $pos
            |Monthly Income: $sal
        """.trimMargin())
    }
}
fun main ()
{
    println()
    val worker = IT("Shareyar Farooqui", 20, "HOD", 120000)
}

/*OUTPUT: 
Employee
Name: Shareyar Farooqui
Age: 20
Position: HOD
Monthly Income: 120000*/

//CODE 4 PLOYMORERISM: 

class overloading_ex()
{
    fun overload() = println("Overload function with no parameters is achieved.")
    fun overload(sf:String) = println("Overload function with 01 String parameters is achieved.\tsf = $sf")
    fun overload(sf:Int) = println("Overload function with 01 Int parameters is achieved.\tsf = $sf")
    fun overload(sf:Int, sf2:String ) = println("Overload function with 02 parameters is achieved.\tsf = $sf sf2 = $sf2")
}

//The open keyword means “open for extension“.
// It allows others to inherit from this class. By default, all classes in Kotlin are final.
//The final modifier mark classes and methods as not allowed to be overridden.
open class overridding_ex()
{
    open fun override_function() = println("Override function in parent class.")
}

class testing_overide(): overridding_ex()
{
    override fun override_function() = println("Override function in Child class.")
}

fun main()
{
    val OL = overloading_ex()
    println("\nPrinting overloading methods.")
    OL.overload()
    OL.overload("HelloWorld")
    OL.overload(19)
    OL.overload(19,"HelloWorld")

    val OR1 = overridding_ex()
    val OR2:overridding_ex = testing_overide()
    println("\nPrinting overloading methods")
    OR1.override_function()
    OR2.override_function()
}

/*OUTPUT: 
Printing overloading methods.
Overload function with no parameters is achieved.
Overload function with 01 String parameters is achieved.	sf = HelloWorld
Overload function with 01 Int parameters is achieved.	sf = 19
Overload function with 02 parameters is achieved.	sf = 19 sf2 = HelloWorld

Printing overloading methods
Override function in parent class.
Override function in Child class.*/

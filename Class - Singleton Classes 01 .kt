//CODE 4 SINGLETON CLASS:

fun main()
{
    println(Operations.name)
    println("The answer of addition is ${Operations.add(47,13)}")
    println("The answer of Subtraction is ${Operations.sub(7,23)}")
    println("The answer of Division is ${Operations.div(90.0F,15F)}")
}

object Operations
{
    //The following are the properties of a typical singleton class:
    //Only one instance: The singleton class has only one instance and this is done by providing an instance of the class, within the class.
    //Globally accessible: The instance of the singleton class should be globally accessible so that each class can use it.
    //Constructor not allowed: We can use the init method to initialize our member variables.
    
    init
    {
        println("Singleton class has been accessed.")
    }

    var name = "OPERATION CLASS IS A SINGLETON CLASS."

    fun add(num1:Int,num2:Int):Int
    {
        return num1.plus(num2)
    }

    fun sub(num1:Int,num2:Int):Int
    {
        return num1.minus(num2)
    }

    fun div(num1:Float,num2:Float):Float
    {
        return num1.div(num2)
    }
}


/*OUTPUT:
Singleton class has been accessed.
OPERATION CLASS IS A SINGLETON CLASS.
The answer of addition is 60
The answer of Subtraction is -16
The answer of Division is 6.0*/

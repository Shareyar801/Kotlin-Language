//CODE 4 INHERITANCE WITH CONSTRUCTORS: 

//The open keyword means “open for extension“ - i.e. it's possible to create subclasses of an open class.
open class MobilePhone (val name: String, val ModelYr: Int)
{
    //WHILE INHERITING A CLASS WE MARK BASE CLASS WITH OPEN KEYWORD
    init {
        println("The phone u are using is $name of $ModelYr.")
    }

    fun functions() = println("It have various components and function that it can operate.")
}
class iPhone (name: String, ModelYr: Int, var OSversion: Int, var cam: Int): MobilePhone(name, ModelYr)
{
    init {
        println("Its has IOS $OSversion and comes with $cam mp.")
    }

    fun check_app_availibilty()
    {
        println("Facetime is available in this model of Iphone.")
    }
}
class android (name: String, ModelYr: Int, var OSver: String, var gpu: String): MobilePhone(name, ModelYr)
{
    init {
        println("Its has android $OSver and comes with $gpu GPU.")
    }

    fun app_availibilty()
    {
        println("Csanner is available in this model of Iphone.")
    }
}

fun main ()
{
    println()
    val iph = iPhone("IPhone 12 Pro Max", 2020,14, 16)
    iph.functions(); iph.check_app_availibilty()

    println()
    val and = android("Redmi note 9", 2020,"Oreo", "Rc10")
    and.functions(); and.app_availibilty()
}

/*OUTPUT: 
The phone u are using is IPhone 12 Pro Max of 2020.
Its has IOS 14 and comes with 16 mp.
It have various components and function that it can operate.
Facetime is available in this model of Iphone.

The phone u are using is Redmi note 9 of 2020.
Its has android Oreo and comes with Rc10 GPU.
It have various components and function that it can operate.
Csanner is available in this model of Iphone.*/

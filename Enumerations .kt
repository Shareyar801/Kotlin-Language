CODE 4 ENUMERATIONS: 
enum class CupSize(val qty: String)
{
    SMALL("270ml")
    {
        override fun getdetails():String{
            return ("Your cup size is ${name} which has size of ${qty}.")
        }
    },
    MEDUIM("350ml")
    {
        override fun getdetails():String{
            return ("Your cup size is ${name} which has size of ${qty}.")
        }
    },
    LARGE("480ml")
    {
        override fun getdetails():String{
            return ("Your cup size is ${name} which has size of ${qty}.")
        }
    },
    EXTRA_L("620ml")
    {
        override fun getdetails():String{
            return ("Your cup size is ${name} which has size of ${qty}.")
        }
    };
    abstract fun getdetails():String
    
    //ordinal: This property stores the ordinal value of the constant, which is usually a zero-based index.
    //name: This property stores the name of the constant.
    //values: This method returns a list of all the constants defined within the enum class.
    //valueOf: This methods returns the enum constant defined in enum, matching the input string.
    //https://www.youtube.com/watch?v=DhYSmZw_4NA.
}
fun main()
{
    for (i in 0 until CupSize.values().size)
    println(CupSize.values().get(i).getdetails())
}

/*OUTPUT:
Your cup size is SMALL which has size of 270ml.
Your cup size is MEDUIM which has size of 350ml.
Your cup size is LARGE which has size of 480ml.
Your cup size is EXTRA_L which has size of 620ml.*/

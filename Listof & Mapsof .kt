//CODE FOR CLASS, LISTOF, MAPSOF: 

class list_class                //USING LIST_OF IN CLASS
{
    val car_manufcatures = listOf<String>("Suzuki", "Toyota", "Proton", "Kia", "MG", "Honda")       //immutable listOf
    val car_model = mutableListOf("Cultus", "Corolla", "C1", "Picanto", "ZS", "Civic")              //mutable listOf
    val car_eng_siz = listOf(800, 1800, 1000, 1000, 2000, 1800)                                     //immutable listOf
    
    //immutable variable: It is an object whose state cannot be modified after it is created.
    
    fun display_data()
    {
        for (sf in 0..car_manufcatures.size-1)
        {
            println("0${sf+1}. Manufacture: ${car_manufcatures[sf]} \t  Model: ${car_model[sf]} \t  Engine: ${car_eng_siz[sf]}cc ")
        }
        println()
    }
}

class maps_class            //USING MAP_OF IN CLASS
{
    val ProgrammingLang = mapOf("C#" to 2000, "C++" to 1979, "Kotlin" to 2011)

    fun print_info()
    {
        var sf = 0
        ProgrammingLang.forEach { pro, year -> println("0${sf+1}.Language $pro was introduced in $year."); sf++ }
    }
}

fun main()
{
    val lc = list_class()
    lc.display_data()

    val mc = maps_class()
    mc.print_info()
}

/*OUTPUT: 
01. Manufacture: Suzuki 	  Model: Cultus 	  Engine: 800cc 
02. Manufacture: Toyota 	  Model: Corolla 	  Engine: 1800cc 
03. Manufacture: Proton 	  Model: C1 	  Engine: 1000cc 
04. Manufacture: Kia 	  Model: Picanto 	  Engine: 1000cc 
05. Manufacture: MG 	  Model: ZS 	  Engine: 2000cc 
06. Manufacture: Honda 	  Model: Civic 	  Engine: 1800cc 

01.Language C# was introduced in 2000.
02.Language C++ was introduced in 1979.
03.Language Kotlin was introduced in 2011.*/

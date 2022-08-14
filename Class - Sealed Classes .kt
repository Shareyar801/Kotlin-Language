//CODE 4 Sealed Class: 

sealed class Animal()
{
    //A sealed class is implicitly abstract and hence it cannot be instantiated.
    //All the subclasses of the sealed class must be defined within the same Kotlin file.
    //Any class outside the file will not be inherited by a sealed class.
    //Its used to restrict 3rd party from making a adjustments or extending it with help of extra files when source code is private.
    //Constructors of sealed classes can have one of two visibilities: protected (by default) or private.
    //https://www.youtube.com/watch?v=pe8hL9hRtMM.
}

class Cat(): Animal()
{
    init {
        println("""Printing facts about Cats.
            |01.They are small carnivorous mammal.
            |02.They have Lifespan of 2 – 16 years (In the wild)
            |03.The oldest known pet cat existed 9,500 years ago.
            |04.Cats sleep for around 13 to 16 hours a day (70% of their life). """.trimMargin()) }
}

class Dog(): Animal()
{
    init {
        println("""
            |01.The dogs is a domesticated descendant of the wolf.
            |02.They have Lifespan of 10 – 13 years
            |03.Their sense of smell is at least 40x better than ours.
            |04.Dog urine can corrode metal. """.trimMargin()) }

}

class Mouse(): Animal()
{
    init {
        println("""
            |01.A mouse is a small rodent.
            |02.They have Lifespan of 5 – 7 years
            |03.Mice have weak eyesight.
            |04.House mice are omnivorous but prefer to consume grains, fruits and seeds. """.trimMargin()) }
}

fun main()
{
    print("To know about Cats, Dogs and Mouse press 1, 2 & 3 respectively: ")
    val inp = Integer.valueOf(readLine())
    val ani: Animal

    println()
    when(inp){
        1 -> ani = Cat()
        2 -> ani = Dog()
        3 -> ani = Mouse()
    }
}
/*OUTPUT: 
To know about Cats, Dogs and Mouse press 1, 2 & 3 respectively: 3

01.A mouse is a small rodent.
02.They have Lifespan of 5 – 7 years
03.Mice have weak eyesight.
04.House mice are omnivorous but prefer to consume grains, fruits and seeds. */

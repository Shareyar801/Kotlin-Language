//CODE 4 DATA CLASS, HASHCODE & COPY:

//declaring a data class
//A data class is a class that only contains state and does not perform any operation.
data class FirstMan(val name: String, val age: Int)

fun main(args: Array<String>)
{

    val Sman1 = FirstMan("manish",18)                   //manish, 18
    val Sman2 = Sman1.copy(name="rahul")                //rahul, 18
    val Sman3 = Sman1.copy();                           //manish, 18

    val hash1 = Sman1.hashCode();                       //for example: 120242652
    val hash2 = Sman2.hashCode();                       //for example: 845109357
    val hash3 = Sman3.hashCode();                       //for example: 120242652

    println(hash1)                                      //for example: 120242652
    println(hash2)                                      //for example: 845109357
    println(hash3)                                      //for example: 120242652

    //checking equality of these hash codes
    println("hash1 == hash 2 ${hash1.equals(hash2)}")   //false
    println("hash2 == hash 3 ${hash2.equals(hash3)}")   //false
    println("hash1 == hash 3 ${hash1.equals(hash3)}")   //true

}

/*OUTPUT:
835510190
-938448478
835510190
hash1 == hash 2 false
hash2 == hash 3 false
hash1 == hash 3 true*/

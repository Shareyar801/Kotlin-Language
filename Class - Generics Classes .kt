//CODE 4 GENERICS
class Company<T> (text : T){
    var x = text
    init{
        println(x)
    }

    fun <T> com_registration_num(no: T) = println("Registration number: $no")

}
fun main(args: Array<String>){
    var com = Company<String>("Corporate")
    com.com_registration_num(12826)

    var cor = Company<Int>(1001)
    cor.com_registration_num("4A85R28")
}

/*OUTPUT:
Corporate
Registration number: 12826
1001
Registration number: 4A85R28*/

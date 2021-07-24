//Q1: Write a code which checks that a user is eligable for voting in general election or not. If is yes then issue a voter id to him. Also print all details of voter.

CODE: 
fun main()
{
    //val keyword is used for those variables whose values are defined once.
    //var keyword is used for those variables whose values can be defined more than once.
    val fname = "Shareyar" ; val lname = " Farooqui"
    var age : Int
    var voter_id : String
    var flag : Boolean = false

    print("Enter your Age: ")
    age = Integer.valueOf(readLine())

    println("\nName: $fname $lname")        // Difference b/t println & print is same as difference b/t writeline & write in C#.
    println("age: $age")

    //if else condition implementation
    if (age >= 18)
    {
        println("You Can Vote In General Elections!!!")
        flag = true; voter_id = "101B"
    }
    else
    {
        println("You Cann't Vote In General Election!!!")
        voter_id = "null"
    }

    // when is switch version of kotlin
    if (flag)
    {
        when (voter_id)
        {
            "101B" -> println("1st when entered: value of id  is 101B")
            else -> println("1st when entered: value of id  is $voter_id")
        }

        voter_id = "2011BA"
        when (voter_id)
        {
            "101B" -> {println("2nd when entered: value of id is 101B")}
            "2011BA" -> println("2nd when entered: value of id is $voter_id")
        }
    }
}

/*OUTPUT: 
Enter your Age: 19

Name: Shareyar  Farooqui
age: 19
You Can Vote In General Elections!!!
1st when entered: value of id  is 101B
2nd when entered: value of id is 2011BA*/

//CODE FOR ARRAY:
fun main()
{
    // MAKE ARRAY OF 3 & PLUS [0],[2],[3] WITH [1],[3],[5] AND SAVE DATA IN ANOTHER SET OF ARRAY.
    var sf = 0; var sf2 = 0;
    val num_arr1 = arrayOf(140, 185, 202, 909, 259, 157)
    var num_arr2: Array<Int> = Array(3) {0; 0; 0}        //Array<Int> used to declare variable type of array.

    for (sf in 0..num_arr1.size-1)
    {
        if (sf % 2 == 0)
        {
            num_arr2[sf2] = num_arr1[sf].plus(num_arr1[sf + 1])
            ++sf2
        }
        else
            continue
    }
    print("Array 02 values:  ")
    for (sf3 in 0..num_arr2.size-1)
    {
       // print("$num_arr2 ")
        print(" " + num_arr2.get(sf3))
    }
}

//OUTPUT:
//Array 02 values: 325 1111 416

fun main() {
    println("Enter the size of an array:")
    val n = readln().toInt()
    println("Array elements are :")
   val arr= IntArray(n)
    for(i in 0 until n){
        arr[i]= readln().toInt()
    }
    val uniqueArray=arr.toSet()
    println("Elements are removing the duplicates:")
    println(uniqueArray.joinToString(", "))
}




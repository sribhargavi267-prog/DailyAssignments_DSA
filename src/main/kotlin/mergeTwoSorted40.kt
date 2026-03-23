fun main() {
    println("Enter the size of an array: ")
    val n1 = readln().toInt()
    println("Enter the elements of first array:")
    val arr1= IntArray(n1)
    for(i in 0 until n1) {
        arr1[i]=readln().toInt()
    }
    println("Enter the size of second array: ")
    val n2 = readln().toInt()
    println("Enter the elements of first array:")
    val arr2= IntArray(n2)
    for(i in 0 until n2) {
        arr2[i]=readln().toInt()
    }
    arr1.sort()
    arr2.sort()
    val mergeArr=arr1+ arr2
    mergeArr.sort()
    println("Sorted merged are")
    for(num in mergeArr){
        print("$num ")
    }


}

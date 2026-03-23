fun main() {
    println("Enter the size of array:")
    val n = readln().toInt()
    println("Array elements are:")
    val arr= IntArray(n)
    for(i in 0 until n){
        arr[i]=readln().toInt()
    }
    println("Enter the kth element:")
    val k=readln().toInt()
    arr.sort()
    println("Kth smallest element is:${arr[k-1]}")
    println("Kth largest element is : ${arr[n-k]}")


}
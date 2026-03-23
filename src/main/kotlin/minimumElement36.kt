
fun minimum(arr: IntArray): Int{
    var max=arr[0]
    for(i in 0 until arr.size) {
        if(arr[i]<max) {
            max=arr[i]
        }
    }
    return max
}

fun main() {
    println("Enter the size of an array:")
    val n=readln().toInt()
    println("Enter the elements in an array:")
    val arr= IntArray(n)
    for(i in 0 until n) {
        arr[i]=readln().toInt()
    }
    val res=minimum(arr)
    println("Minimum element in an array: $res")
}
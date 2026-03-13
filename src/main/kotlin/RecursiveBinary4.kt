package org.example
fun binarySearch(arr: Array<Int>,start:Int,end:Int,target:Int) :Int {

    if(start>end){
        return -1
    }
    val mid=(start+end)/2
    if(arr[mid]==target) {
        return 1
    }
    else if(arr[mid] < target) {

        return binarySearch(arr, mid + 1, end, target)

    }
    else {
        return binarySearch(arr,start,mid+1,target)
    }


}

fun main() {
    print("Enter number of elements:")
    val n = readln().toInt()
    println("Enter $n elements:")
    val arr = Array<Int>(n) { 0 }
    for (i in 0 until n) {
        arr[i] = readln().toInt()
    }
    print("Enter the target element:")
    val target = readln().toInt()
    val res=binarySearch(arr,0,n-1, target)
    if(res!=-1) {
        println("Element is found")
    }
    else {
        println("Not found")
    }

}
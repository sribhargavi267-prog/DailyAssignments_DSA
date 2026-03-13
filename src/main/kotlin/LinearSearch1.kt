package org.example

fun linearSearch(n: Int, arr: Array<Int>, target: Int):Int {

    for (i in 0 until n) {
        if (arr[i] == target) {
            return i
            break
        }
    }
    return -1

}
fun main() {

    print("Enter number of elements:")
    val n = readln().toInt()
    println("Enter $n elements:")
    var arr = Array<Int>(n) { 0 }
    for (i in 0 until n) {
        arr[i] = readln().toInt()
    }
    print("Enter the target element:")
    val target = readln().toInt()
    var res = linearSearch(n,arr,target)
    if(res!=1)
    {
        println("Element is found ")
    }
    else {
        println("Position not found")
    }
}


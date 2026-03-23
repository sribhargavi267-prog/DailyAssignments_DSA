fun main() {
    println("Enter the size of elements")
    val n =readln().toInt()

    println("Enter the array elements :")
    val arr= IntArray(n)
    for(i in 0 until n ){
        arr[i]=readln().toInt()
    }
    println("Enter the target element:")
    val target=readln().toInt()
    var found=false
    for(i in 0 until n) {
        for(j in i+1 until n)
            if (arr[i] + arr[j] == target) {
                println("pair found:${arr[i]},${arr[j]}")
                found = true
                break
            }
    }
    if(!found) {
        println("Not found")
    }

}
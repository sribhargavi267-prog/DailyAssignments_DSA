fun main() {
    println("Enter the size of array: ")
    val n =readln().toInt()
    println("Enter the elements in an array: ")
    val arr= IntArray(n)
    for(i in 0 until n) {
        arr[i]=readln().toInt()
    }
    val map= HashMap<Int,Int>()
    for(num in arr) {
        if(map.containsKey(num)) {
            map[num]=map[num]!!+1
        }else {
            map[num]=1
        }
    }
    for((key,value) in map) {
        println("$key->$value times")
    }
}
fun moveZeroToEnd(arr: IntArray) {
    var index = 0
    for (i in arr.indices) {
        if (arr[i] != 0) {
            var temp = arr[i]
            arr[i] = arr[index]
            arr[index] = temp
            index++
        }
    }

}
fun main() {
    val arr =intArrayOf(0,1,2,45,0,3,2,0,0,8)
    val arr1=moveZeroToEnd(arr)
    println(arr.joinToString())
}
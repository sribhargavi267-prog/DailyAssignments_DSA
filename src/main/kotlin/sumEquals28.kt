fun sumEquals(arr: IntArray):Int {
    val sum=arr.sum()
    var leftSum=0
    for(i in arr.indices) {
        val rightSum=sum-(leftSum+arr[i])
        if(leftSum==rightSum) {
            return i
        }
        leftSum+=arr[i]
    }
    return -1
}
fun main() {

    println("Enter the no of elements in an array:")
    val n =readln().toInt()
    println("Enter the elements in an array:")
    val arr= IntArray(n)
    for(i in 0 until n){
        arr[i]=readln().toInt()
    }
    val result=sumEquals(arr)
    if(result!=-1) {
        println("Index at which left side elements is equals to right side is : $result")
    }
    else {
        println("No index found")
    }


}
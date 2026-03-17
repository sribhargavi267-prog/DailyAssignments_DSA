fun main() {
    print("Enter the no.of Elements: ")
    val n= readln().toInt();
    val ar: Array<Int> = Array( n) {0 }
    println("Enter the elements in an array")
    for(i in 0 until n){
        ar[i]=readln().toInt()
    }
    var smallest=ar[0]
    var secondSmallest=ar[0]
    for(i in 0 until n) {
        val num = ar[i]
        if (ar[i] < smallest) {
            secondSmallest = smallest
            smallest = ar[i]
        } else if (num < secondSmallest && num != smallest) {
            secondSmallest = num
        }
    }
    println("Second smallest number is $secondSmallest")
}
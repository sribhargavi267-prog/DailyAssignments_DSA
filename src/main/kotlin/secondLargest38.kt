fun main() {
    print("Enter the no.of Elements: ")
    val n= readln().toInt();
    val ar: Array<Int> = Array( n) {0 }
    println("Enter the elements in an array")
    for(i in 0 until n){
        ar[i]=readln().toInt()
    }
    var largest=0
    var secondLargest=0
    for(i in 0 until n){
        val num=ar[i]
        if(ar[i]>largest) {
            secondLargest=largest
            largest=ar[i]
        }
        else if(num>secondLargest && num!=largest) {
            secondLargest=num
        }
    }
    println("Second largest number is $secondLargest")
}
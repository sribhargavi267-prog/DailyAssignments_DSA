
fun permutations(n: Int,r: Int) :Int{
    fun factorial(n:Int):Int{
        var res=1
        for(i in 1..n){
            res=res*i
        }
        return res
    }
    return factorial(n)/factorial(n-r)

}

fun main() {
    println("Enter the value of n:")
    val n=readln().toInt()
    println("Enter the value of r:")
    val r=readln().toInt()
    val result=permutations(n,r)
    println("Result = $result")
}
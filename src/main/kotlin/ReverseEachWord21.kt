fun main() {
    println("Enter the string:")
    var str=readln()
    var str1=str.split(" ")
    for(i in str1) {
        print(i.reversed()+" ")
    }


}
fun main() {
    println("Enter the first string")
    var str1=readln()
    println("Enter the second string")
    var str2=readln()
    var str3= StringBuffer()
    for(ch in str1) {
        if(ch !in str2) {
            str3.append(ch)
        }

    }

    println("Result=$str3")
}
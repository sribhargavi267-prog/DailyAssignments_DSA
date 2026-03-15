import java.util.Locale
import java.util.Locale.getDefault

fun main() {
    println("Enter the first string:")
    var str1= readln().lowercase()
    println("Enter the second string:")
    var str2=readln().lowercase()
    if(str1.length==str2.length && (str1+str1).contains(str2)){
        println("String are rotations of each other")
    }
    else {
        println("Strings are not rotations of each other")
    }
}
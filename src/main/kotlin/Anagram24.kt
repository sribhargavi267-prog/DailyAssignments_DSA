

fun main(){
    println("Enter the first string:")
    var str1=readln().toCharArray()
    println("Enter the second string:")
    var str2=readln().toCharArray()
    str1.sort()
    str2.sort()

    if(str1.indices==str2.indices && str1.contentEquals(str2)  ){
        println("Given two strings are Anagrams")
    }
    else {
        println("Two strings are not Anagrams")
    }
}
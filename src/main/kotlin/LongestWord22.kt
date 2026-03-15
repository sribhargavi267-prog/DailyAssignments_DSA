fun main() {
    println("Enter the string:")
    var str=readln()
    var str1=str.split(" ")
    var longestWord=" "
   for(i in str1) {
       if (i.length > longestWord.length) {
           longestWord = i
       }
   }
    println("Longest word in the sentence is: $longestWord")
}
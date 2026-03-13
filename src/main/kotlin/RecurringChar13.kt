package org.example
fun main() {
    print("Enter the character: ")
    var maxChar=' '
    var maxCount=0

    val str = readln()
    val map = mutableMapOf<Char, Int>()

    for (ch in str) {
        if (map.containsKey(ch)) {
            map[ch] = map[ch]!! + 1
        } else {
            map[ch] = 1
        }
    }

    for ((key, value) in map) {
        if (value > maxCount) {
            maxCount = value
            maxChar = key
        }
    }
    println("Most recurring character: $maxChar")

}
package org.example
fun main() {
    print("Enter the character: ")
    val str = readln()
    val map = mutableMapOf<Char, Int>()

    for (ch in str) {
        if (map.containsKey(ch)) {
            map[ch] = map[ch]!! + 1
        } else {
            map[ch] = 1
        }

    }

    println("Character occurrences:")
    for ((key, value) in map) {
        println("$key -> $value")
    }
}
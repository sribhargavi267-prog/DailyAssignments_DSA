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
    for(ch in str) {
        if(map[ch]==1) {
            println("The first non repeating character is $ch")
            break
        }
    }
}
fun main() {
    print("Enter text: ")
    var str = readln()
    var strcpy= StringBuffer()
    var duplicates = StringBuffer()


    for (ch in str) {
        if (ch in strcpy) {
            duplicates.append(ch)
        }
        else {
            strcpy.append(ch)
        }
    }
    println(duplicates)

}
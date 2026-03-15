fun main() {
    print("Enter text: ")
    var str = readln()
    var cpystr = StringBuffer()
    var str1= StringBuffer()

    for (ch in str) {
        if (ch !in cpystr) {
            cpystr.append(ch)
        }
    }
    println(cpystr)


}
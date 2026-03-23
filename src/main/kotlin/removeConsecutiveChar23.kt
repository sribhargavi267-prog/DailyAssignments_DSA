fun String.removeDuplicates():String {
    if(this.isEmpty()) {
        return this
    }
    val result = StringBuffer()
    result.append(this[0])
    for(i in 1 until this.length) {
        if(this[i]!=this[i-1]) {
            result.append(this[i])
        }
    }
    return result.toString()
}

fun main() {
    val str = "pppprrrrooogggrrrraaammm tttttoooo"
    val res = str.removeDuplicates()
    println("character after removing the duplicates $res")
}
fun main() {
    print("Enter a string")
    var str=readln()
    var first=0
    var isPalindrome=true
    var last=str.length-1
    while(first<last){
        if(str[first]!=str[last]) {
            isPalindrome=false
            break
        }
        first++
        last--
    }
    if(isPalindrome){
        print("String is palindrome")
    }
    else {
        print("Not a palindrome")
    }

}
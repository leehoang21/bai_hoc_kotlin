import kotlin.system.exitProcess

fun main() {
    var s = readln()
    //biến chuỗi thành mảng
    var f =  s.indices
    for (i in s.indices){
        if(s[i] != s[s.length-i-1]){
            println("sai")
            exitProcess(0)
        }
    }
    println("dung")




}
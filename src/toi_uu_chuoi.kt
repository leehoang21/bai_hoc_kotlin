import java.util.*

fun main() {
    var s  = "  as  sadasd sadasd  ".trim().lowercase()
    var a  = s.split(" ")
    s=""
    var d= ""
    for (i in a){
        d = i.trim()
        if(!d.equals("")){
            s += d.replaceFirst(d.get(0),d.get(0).uppercaseChar()) +" "

        }
    }
    println(s)
}
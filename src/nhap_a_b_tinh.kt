fun main() {
    var a = readln().toInt()
    var b = readln().toInt()
    var e = readln()
    when{
        e.equals("+") -> println(a+b)
        e.equals("-") -> println(a-b)
        e.equals("*") -> println(a*b)
        e.equals("/") -> println(a/b)

    }
}
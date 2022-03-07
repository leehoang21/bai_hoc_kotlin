fun main() {
    val s= "d:/bolero/cccc.mp3"
    val d = s.split('/')
    val ss = d[d.size-1]
    println(ss)
    println(ss.split('.').first())
}
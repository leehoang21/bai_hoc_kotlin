/*
    s.replace(<oldValue>>,<newValue>) : thay thế chuỗi old thành chuỗi new
    s.replaceFirst(<oldValue>>,<newValue>) : chỉ thay thế chuỗi old đầu tiên tìm thấy thành chuỗi new
 */
fun main() {
    val s = "223322"
    val x = s.replace("22","23")
    val y = s.replaceFirst("22","244")
    println(y)
}
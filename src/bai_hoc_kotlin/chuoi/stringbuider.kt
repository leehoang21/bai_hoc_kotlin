

fun main() {
    //contructor
    /*
        StringBuilder(int ca)   : ca có thể để trống và mặc định = 16 . chuỗi có ca kí tự
        StringBuilder(String s) : truyền s vào stringBuider

     */
    var s = StringBuilder("contact")
    // nối chuỗi
    s.append("+contra")
    println(s)
    //chèn chuỗi
    s.insert(3,4)
    println(s)
    //dao chuoi
    s.reverse()
    println(s)
    //xoa chuoi
    s.delete(0,10)
    println(s)
    println(s.length)

}
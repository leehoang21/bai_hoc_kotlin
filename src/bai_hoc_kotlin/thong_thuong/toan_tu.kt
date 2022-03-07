package bai_hoc_kotlin.thong_thuong

fun main() {
    /*
    toán tử      |  mô tả                 | phương thức
    +               cộng                    a.plus(b)
    -               trừ                     a.minus(b)
    *               nhân                    a.times(b)
    /               chia                    a.div(b)
    %               chia lấy phần dư        a.rem(b)
    ==              so sánh bằng            a.equals(b)
    <               nhỏ hơn                 a.compareTo(b) < 0
    >               lớn hơn                 a.compareTo(b) > 0
    &&              and                     a.and(b)
    ||              or                      a.or(b)
    ++              công 1                  a.inc()
    --              trừ 1                   a.dec()
     */
    println(1+2)
    println(1.plus(2))
    println(4%2)
    println(4.rem(2))
    println(message = '2' == '2')
    println(2.compareTo(3) > 0)
    println(true.and(false))
    println(true && false)
    var a = 1
    println(++a)
    println(1.inc())

}
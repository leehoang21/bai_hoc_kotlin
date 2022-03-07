package bai_hoc_kotlin.thong_thuong

//when thay thế cho switch trong Kotlin
/*when(<expression>){
    <value 1> -> <statement 1>
    <value 2> -> <statement 2>
    ....
    else      -> <statement else>
    }
 */
//cú pháp thứ 2 của when
// có thể thêm dấu chấm than vào in nếu giá trị ko nằm trong min max thì statement dc trả về
/*
    when(<expression>){
        in <min1>..<max1> -> <statement 1>
        in <min2>.rangeTo(<max2>) -> <statement 2>
        !in <min3>..<max3> -> <statement 2>
        ....
        else      -> <statement else>
    }
 */
fun main() {
    var a=2
    when(a){
        1 -> println(1)
        4/2 -> println(2)
        else -> println("else")
    }
    when{
        3%2 == 0 -> println("chan")
        3%2!=0 -> println("le")
    }

    var tuoi=18
    when(tuoi){
        in 2..3 -> println("2-3")
        in 4.rangeTo(10) -> println("4-10")
        !in 2.rangeTo(10) -> println("ko 2-10")
        in 10.rangeTo(20) -> println("10-20")
        else -> println("not")
    }
}
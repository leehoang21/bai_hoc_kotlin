package bai_hoc_kotlin.thong_thuong

fun main() {
    /*
    cú pháp : step ko khai báo thì step là 1

    for (<hh>){
        <câu lênh>
    }
    <hh> : x mặc định = 1
      1 :  i in a.rangeTo(b) step x   : chạy từ a -> b , step x
      2 :  i in b downTo a   step x   : chạy từ b -> a , step -x
      3 :  i in a until  b    step x  : chạy từ a -> b , step x
      4 :  i in iterator              : duyệt từng phần tử trong iterator

     */

    //VD
    /*for (i in 0.rangeTo(10) step 2){
        println(i)
    }
    for (i in 10 downTo 0 step  2){
        println(i)
    }
    for(i in 1 until 10 step 2 ){
        println(i)
    }

     */
    var arr = arrayOf("2",'1','2','2',2,34,'a')
    for (i in arr){
        println(i)
    }
}
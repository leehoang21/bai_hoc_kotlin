package bai_hoc_kotlin.thong_thuong

import kotlin.random.Random
import kotlin.system.exitProcess

//cú pháp
//Random.next<kiểu dữ liệu>(n)
/*
    nextInt(n)       : random trả về số nguyên ngẫu nhiên từ [0,n-1]
    nextDouble(n)    : random trả về số thực ngẫu nhiên từ [0,n-1]
    nextBoolean()   : random trả về true or false
 */
fun main() {
    val x = Random.nextInt(100)
    for (i in 0.rangeTo(7)){
        print("nhap so: ")
        val s = readln().toInt()
        if(s==x) {
            println("đúng nó rồi $s")
            exitProcess(0)
        }
        else {
            print("sai rồi nha ")
            if(s < x) println("$s < số cần tìm")
            else println("$s > số cần tìm")
        }
    }
}


package bai_hoc_kotlin.thong_thuong

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    //lấy ngày tháng năm hiện tại
    val cal: Calendar = Calendar.getInstance()
//lấy ngày tháng năm của biến cal
    val date = cal.time
//lấy từng tiêu chí
//  <tên biến>.get(Calendar.<tiêu chí>>)
    val year = cal.get(Calendar.YEAR)
//thay đổi tiêu chí
//  <biến>.set(Calendar.<tiêu chí>,<năm>)
    cal.set(Calendar.YEAR,1990)
    print("cal : $cal\n date : $date\n year : $year\nyear : ${cal.get(Calendar.YEAR)}")
    //định dạng ngày tháng
    val sim = SimpleDateFormat("dd/MM/yyyy hh:m:ss aaa")
    println("\n${sim.format(date)}")
}
fun main() {
    //khai bao
    var a = arrayOf(22,33,44)
    //Trả về phạm vi các chỉ số hợp lệ cho mảng.
    println(a.indices)
    //duyet theo vi tri
    for (i in a.indices) print("$i ")
    //duyet theo gia tri
    for (i in a)
        print("$i ")
    //ham loc mang
    println(a.filter {
        x -> x % 2==0
    })
}
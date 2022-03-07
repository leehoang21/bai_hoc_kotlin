fun main() {
    // mutableList đọc , viết list
    var mutableList = mutableListOf<Int>(1,2,3,4)
    // list chỉ đọc
    val list = listOf<Int>(1,2,3,4)

    //thuộc tinh
    /*
        size                         : kích thước
        add(<VALUE>)                 : thêm 1 phần tử
        addAll(<list>)               : thêm nhiều phần tử
        remove(<value>)              : xóa value tìm thấy đầu tiên trong list
        removeAt(<index>)            : xóa vị trí index
        mutableList.removeIf(filter) : xóa theo điều kiện
        clear()                      : clear list
        sort()                       : sắp xếp list tăng dần
        sortDescending()             : sắp xếp list giảm dần
        filter { x -> <điều kiện>}   : lọc list
        contains(<value>)            : kiểm tra xem value có trong list ko
     */
    mutableList.addAll(listOf(3,4,5))
    mutableList.removeIf({
        x -> x%2==0
    })
    mutableList.contains(1)
    print(mutableList)
}
fun main() {
    var arr = arrayOf(1,2,3,' ')
    var arr2 = arrayOf(arr,arr,arr)
    for (i in arr2) {
        for (j in i)
            print("$j ")
    }
}
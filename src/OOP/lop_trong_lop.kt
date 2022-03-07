//nested class la lop trong lop

class Father (var isNam:Boolean){
    private var it = 1
    // lop con ko the truy cap thanh phan lop cha
    class Child{
        fun ff(){
            //loi
            //return it
        }
    }
    //neu muon lop con truy suat dc du lieu lop cha can them tu khoa inner vao
    inner class Inner{
        fun ff(): Int {
            return it
        }
    }
}

fun main() {
    Father.Child().toString()
    //loi
    Father.Child().ff()
    Father(false).Inner().ff()
}
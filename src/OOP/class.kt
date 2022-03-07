package OOP

//class co the co {} or ko
class Tdd
// contructor primary : co the chua tu khoa contructor or ko
class Test (ma:Int){
    //protected
    //protected
    //public
    //(defaut)
    var mm = 2

    //khi khai bao contractor primary khi muon dung dc lenh trong {} thi phai them init{}
    init {
        println(ma)
    }
    constructor(ma:Int,tt:String) : this(ma = ma) {}
    //ham
    fun hh(ma:String):String{
        return mm.toString()+"345"+ma
    }
    //support method :  ko truyen ra ngoai chi ho tro trong class
    private fun support(){}
    //service methd : dung de truyen ra ngoai
    public fun service(){}
}
//contructor secondary
private class Secondary{
    constructor(ma:Int){
        println(ma)
    }
    constructor(ma:Int,so:Int)
}


fun main() {
    var t = Test(3)
    print(t.mm)
    println(t.hh("334"))
}
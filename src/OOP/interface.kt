package OOP

interface InterFather{
    //bat buoc override
    fun tt()
    fun  fd()
    // ko bat buoc override
    fun ff(){
        //body
    }

}
class InterChild : InterFather {
    override fun tt() {
        TODO("Not yet implemented")
    }

    override fun fd() {
        TODO("Not yet implemented")
    }

}
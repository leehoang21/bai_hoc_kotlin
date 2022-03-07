package OOP
//Kotlin ko ho tro da ke thua , chi ho tro impliment da interface
open class Father(var age: Int, var d: Int) {
    open fun tt(){

    }
    init {
        print(d)
    }
}

class Child() : Father(18,2) {
    override
    fun tt(){
        //toto
    }
}

fun main() {
    var child = Child()
    print(child.age)

}
fun main() {
    //a x2 + bx + c
    print("nhap a ")
    var a = readln().toDouble()
    print("nhap b ")
    var b = readln().toDouble()
    print("nhap c ")
    var c = readln().toDouble()
    //a==0
    if(a==0.0){
        //b==0
        if(b==0.0){
            //c==0
            if(c==0.0)  println("PT VSN")
            else        println("PT VN")
        }else{
            println("x = ${-b/(2*a)}")
        }
    }else{
        val dt = b*b - 4*a*c
        if(dt<0)            println("PT VN")
        else if(dt == 0.0)  println("x =  ${-b/(2*a)} ")
        else                println("""
                                x1 =  ${(-b+dt)/(2*a)}
                                x2 =  ${(-b-dt)/(2*a)}
                            """.trimIndent())


    }

}
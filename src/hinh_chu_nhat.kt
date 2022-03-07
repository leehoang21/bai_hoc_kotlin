class HinhChuNhat( ho:String , ten: String , soSP : Int) {
    private var ho = ""
    private var ten = ""
    private var soSP = 0
    init {
        this.ho = ho
        this.ten = ten
        if(soSP < 0 )
            this.soSP = 0
        else
            this.soSP = soSP
    }

    public var Ho:String
        get() = ho
        set(value) {
            ho = value
        }
    public var Ten : String
        get() = ten
        set(value) {
            ten = value
        }
    public var SoSP : Int
        get() = soSP
        set(value) {
            this.soSP = value
        }
    fun getLuong(): Double {
        return if(soSP < 199)
            soSP*0.5
        else if(soSP < 399)
            soSP*0.55
        else if(soSP < 599)
            soSP*0.6
        else
            soSP*0.65
    }

    override fun toString(): String {
        return """
            ho : ${this.ho}
            ten : ${this.ten}
            luong : ${getLuong()}
        """.trimIndent()
    }
}
package shapes

class Square(val len: Double) : Rectangle(len, len) {

    override fun getName(): String {
        return "Square"
    }
}
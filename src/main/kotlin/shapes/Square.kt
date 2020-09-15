package shapes

class Square(val len: Double) : Rectangle(len, len) {

    override fun getName(): String {
        return "Square"
    }

    fun getDescription(): String {
        val text = "The area of the shape is measured by multiplying the width times the height."
        return text
    }
}
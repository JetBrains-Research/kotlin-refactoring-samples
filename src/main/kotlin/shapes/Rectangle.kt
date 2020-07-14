package shapes

class Rectangle(val width: Double, val length: Double) : BaseShape {
    override fun getArea(): Double {
        return width * length
    }

    override fun getPerimeter(): Double {
        return 2 * (width + length)
    }
}
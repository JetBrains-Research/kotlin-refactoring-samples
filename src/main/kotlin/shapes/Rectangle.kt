package shapes

class Rectangle(val width: Double, val height: Double) : BaseShape {
    override fun getArea(): Double {
        return width * height
    }

    override fun getPerimeter(): Double {
        return 2 * (width + height)
    }
}
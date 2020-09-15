package shapes

open class Rectangle(val width: Double, val height: Double) : Shape {

    override fun getArea(): Double {
        return width * height
    }

    override fun getPerimeter(): Double {
        return 2 * (width + height)
    }

    override fun getName(): String {
        return "Rectangle"
    }

}
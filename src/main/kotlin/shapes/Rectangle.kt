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

    fun getDescription(): String {
        val text = "The area of the shape is measured by multiplying the width times the height."
        return text
    }

}
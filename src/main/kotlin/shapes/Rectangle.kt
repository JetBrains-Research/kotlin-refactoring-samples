package shapes

import Point

class Rectangle(val width: Double, val height: Double) : BaseShape {
    val shapeName: String = "Rectangle"

    override fun getArea(): Double {
        return width * height
    }

    override fun getPerimeter(): Double {
        return 2 * (width + height)
    }

    override fun getName(): String {
        return shapeName
    }

    fun contains(point: Point) {
        // TODO: implement it
    }
}
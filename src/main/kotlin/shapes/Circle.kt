package shapes

import Point
import kotlin.math.pow

class Circle(private val radius: Double) : Shape {
    val shapeName: String = "Circle"

    override fun getArea(): Double {
        return Math.PI * radius.pow(2.0)
    }

    override fun getPerimeter(): Double {
        return 2 * Math.PI * radius
    }

    override fun getName(): String {
        return shapeName
    }

    fun containsPoint(shape: Shape, point: Point) {
        // TODO: implement it
    }

    fun containsPoint(shape: Shape) {
        // TODO: implement it
    }

    fun emptyMethod() {

    }
}
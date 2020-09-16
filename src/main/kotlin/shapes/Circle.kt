package shapes

import Point
import kotlin.math.pow

class Circle(private val radius: Double) {
    val shapeName: String = "Circle"

    fun getArea(): Double {
        return Math.PI * radius.pow(2.0)
    }

    fun getPerimeter(): Double {
        return 2 * Math.PI * radius
    }

    fun getName(): String {
        return shapeName
    }

    fun containsPoint(point: Point) {
        // TODO: implement it
    }

    fun containsPoint() {
        // TODO: implement it
    }

    fun emptyMethod() {

    }
}
package shapes

import kotlin.math.pow

class Circle(private val radius: Double) : BaseShape {
    override fun getArea(): Double {
        return Math.PI * radius.pow(2.0)
    }

    override fun getPerimeter(): Double {
        return 2 * Math.PI * radius
    }
}
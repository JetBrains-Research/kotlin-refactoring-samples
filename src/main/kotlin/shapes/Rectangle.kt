package shapes

open class Rectangle(val width: Double, val height: Double)  {

    fun getArea(): Double {
        return width * height
    }

    fun getPerimeter(): Double {
        return 2 * (width + height)
    }

    open fun getName(): String {
        return "Rectangle"
    }

}
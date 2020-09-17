import person.Car

class Person(val name: String, val age: Int, val id: Int) {
    var car: Car = TODO()

    public fun isAgeValid(): Boolean {
        return age > 0 && age < 110
    }

}
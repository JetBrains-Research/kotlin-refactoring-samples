import person.Car

class Person(val name: String, val age: Int, val id: Int) {
    var car: Car = TODO()

    public fun isAgeValid(): Boolean {
        return isAgeMoreThanZero() && age < 110
    }

    public fun isAgeMoreThanZero(): Boolean {
        return age > 0;
    }
}
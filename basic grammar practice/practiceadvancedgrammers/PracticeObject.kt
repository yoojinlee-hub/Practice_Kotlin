package com.example.practicegrammer

//Singleton Pattern
//한 번만 객체 생성 -> 불필요한 메모리사용 막기
object CarFactory {
    val cars = mutableListOf<Car>()

    fun makeCar(horsePower: Int) : Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }

}

data class Car(val horsePower : Int)

fun main() {
    val car = CarFactory.makeCar(10)
    var car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())


}
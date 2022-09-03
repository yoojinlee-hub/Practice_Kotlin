package com.example.practiceadvancedgrammers

fun main(){
    println(square(12))
    println(nameAge("lee",99))

    val a = "I said "
    val b = "You said "
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana",27))
}

//1.lamda
//람다식은 우리가 마치 value처럼 다룰 수 있는 익명 함수
// 1) 메소드의 파라미터로 넘겨줄 수 있다.
// 2) return값으로 사용할 수 있다.

// 람다의 기본 정의
// val lamdaName : Type = {argumentList -> codeBody}

val square : (Int) -> (Int) = {number -> number*number}

val nameAge= {name:String, age:Int -> "my name is ${name} I'm ${age}"}

// 확장함수
val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name : String, age : Int) : String {
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    // it = 하나 들어가는 파라미터 //this = 확장함수를 call하는 object
    return name.introduceMyself(age)
}
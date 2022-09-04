package com.example.practiceadvancedgrammers

fun main(){
    println(square(12))
    println(nameAge("lee",99))

    val a = "I said "
    val b = "You said "
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana",27))

    println(calculateGreat(97))



    //람다를 표현하는 여러가지 방법
    val lamda = {number: Double ->
        number == 4.3213
    }

    println(invokeLamda(lamda))
    println(invokeLamda({it>3.22})) //직접 함수 전달
    println(invokeLamda{it>3.22}) //마지막 파라미터가 람다식일 때 이렇게 사용 가능

    //익명 랜덤 함수
    //1. Kotlin interface가 아닌 java 인터페이스여야 함
    //2. 그 인터페이스는 딱 하나의 메소드만 가져야 함



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

//람다의 return
//마지막 한 줄이 return
val calculateGreat : (Int) -> String =  { //앞에 input 파라미터는 여러개 가능 -> () 필요
    when(it){
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }

}

//람다를 표현하는 여러가지 방법

fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}


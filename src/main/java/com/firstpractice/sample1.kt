package com.firstpractice

fun main(){

    //3. String Template
    val name = "yoojin"
    val lastName = "lee"
    println("my name is ${name + lastName}")

    println("this is 2\$a") //그냥 $표시하려면 \

    /**
     *
     * *
     * */
}

//1. 함수
fun helloWorld() : Unit { //return 형식이 없음 = void
    println("Hello World!")
}

fun add(a : Int, b : Int) : Int {
    return a+b
}

//2. val vs var
//val = value

fun hi(){
    val a : Int = 10 //상수
    var b : Int = 9 //변수

    val c = 10 //자동으로 안다
    var d = 100 //자동으로 안다

    var name : String = "yoojin"
}
package com.firstpractice

fun main(){
    helloWorld()

    add(4,9)
}

//1. 함수
fun helloWorld() : Unit { //return 형식이 없음 = void
    println("Hello World!")
}

fun add(a : Int, b : Int) : Int {
    return a+b
}
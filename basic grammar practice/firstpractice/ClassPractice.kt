package com.firstpractice

open class Human ( val name : String="Anonymous") {//constructor생략가능

    //java
    /*
    * class Person {
    *   public Person(String name) {
    *
    *   public Person(String name, int age){
    *       this(name);
    *   }
    *}
    * */
    constructor(name: String, age :Int) : this(name){
        println("my name is ${name}, ${age} years old")
    }
    init { //주 생성자의 일부
        println("New human has been born!")
    }
    fun eatingCake(){
        println("This is so YUMMY~")
    }
    open fun singASong(){
        println("lalala")
    }
}

class Korean : Human(){
    override fun singASong(){ //overriding
        super.singASong()
        println("랄랄라")
        println("my name is ${name}")
    }
}


fun main(){
//    val human = Human("minsu")
//
//    val stranger = Human()
//    human.eatingCake()
//
    val mom = Human("Kuri",52)


//    println("this human's name is ${stranger.name}")

    val korean = Korean()
    korean.singASong()
}
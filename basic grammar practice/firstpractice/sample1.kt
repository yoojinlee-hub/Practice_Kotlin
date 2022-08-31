package com.firstpractice

fun main(){

//    //3. String Template
//    val name = "yoojin"
//    val lastName = "lee"
//    println("my name is ${name + lastName}")
//
//    println("this is 2\$a") //그냥 $표시하려면 \
    checkNum(1)

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

//4. 조건식
fun maxBy(a : Int, b : Int) : Int {
    if (a>b){
        return a
    }else{
        return b
    }
}

fun maxBy2(a : Int, b : Int) : Int = if(a>b) a else b //삼항연산자 //Expression

fun checkNum(score : Int) : Unit{ //Expression (무언가 해서 값 반환)
    when(score) { // Statement (명령 지시)
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know")//없어도 상관없음
    }

    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3 //있어야함
    }

    print("b : ${b}")

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay") //없어도 상관없음
    }
}

// Expression vs Statement

// 5. Array and List

// Array == mutable

// List 1. List 2.MutableList

fun array(){
    val array : Array<Int> = arrayOf(1,2,3) //array 초기화
    val list : List<Int> = listOf(1,2,3) //list 초기화

    val array2 :Array<Any> = arrayOf(1,"d",3.4f)
    val list2 : List<Any> = listOf(1,"d",3L)

    array[0] = 3 //가능
    //list[0] = 2 불가능
    var a = list.get(0)

    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)

}
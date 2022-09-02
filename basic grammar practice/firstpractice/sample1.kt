package com.firstpractice

fun main(){

//    //3. String Template
//    val name = "yoojin"
//    val lastName = "lee"
//    println("my name is ${name + lastName}")
//
//    println("this is 2\$a") //그냥 $표시하려면 \
    nullcheck()

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

// 6. for and while

fun forAndWhile(){
    val students = arrayListOf("yoojin","joyce","jennifer")

    for (name in students){
        println("${name}")
    }

    for ((index,name) in students.withIndex()){
        println("${index+1}번째 학생: ${name}")
    }

    var sum : Int = 0
    for(i in 1..10 step 2){
        sum += i //1 3 5 7 9
    }
    println(sum)
    for(i in 10 downTo 1){
        sum -= i //10 9 8 7 6 5 4 3 2 1
    }
    for(i in 1 until 100){
        sum -= i //100 포함하지않음
    }


    var index=0
    while(index<10){
        println("current index: ${index}")
        index++
    }

}

// 7. Nullable , NonNull
fun nullcheck(){
    //NPE: Null pointer Exception

    var name : String = "yoojin"

    var nullName : String? = null //타입 생략 불가
    // ERROR  var nullName : String = null

    var nameInUpperCase = name.toUpperCase()

    var nullNameInUpperCase = nullName?.toUpperCase()

    //?:엘비스 연산자
    val lastName : String? = null
    val fullName = name + ""+ (lastName?: "No lastname")

    println(fullName)
}
//!!
fun ignoreNullls(str : String?){
    val mNotNull : String = str!! //절대로 null 아님
    val upper = mNotNull.toUpperCase()

    //?:
    val email : String? = "adria@nanana.com"
    email?.let{
        println("my email is ${email}")
    }
}


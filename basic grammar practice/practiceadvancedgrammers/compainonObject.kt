package com.example.practicegrammer

fun main(){
    //val book = Book() //불가능
    val book = Book.create()
    val bookId = Book.BookFactory.getId()
    println("${book.id} ${book.name}")
    println(bookId)
}


//companionObject
//정적메소드
//자바의 static대신,,
class Book private constructor(val id : Int,val name : String ){


    companion object BookFactory : IdProvider{ //private를 읽어올 수 있게 만듦

        override fun getId(): Int {
            return 123
        }

        val myBook = "name"
        fun create() = Book(getId(),myBook)
    }

}

interface IdProvider{
    fun getId() : Int
}
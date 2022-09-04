package com.example.practiceadvancedgrammers



data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)

//toString(), hashCode(), equals(), copy()

class TicketNomal(val companyName : String, val name : String, var date : String, var seatNumber : Int)

fun main(){
    val ticketA = Ticket("koreanAir","lee","2022-09-04",14)
    val ticketB = TicketNomal("koreanAir","lee","2022-09-04",14)

    println(ticketA)
    println(ticketB)
}
package com.bilqismufida.kotlinoop.app

//Oject Oriented Programming = OOP

//Abstract Class

abstract class Main_Animal(val name : String, val foot : Int){
    var eyes = "Dark"
    abstract val color : String

    abstract fun walk()
    abstract fun talk()

    fun eat(){
        println("This animal can eat")
    }

    fun breathing(){
        println("Breath")
    }
}

interface Animals{
    fun breathing(){
        println("Brething")
    }

    var eyes: String
}

class Turtle(Name : String, Foot : Int) : Main_Animal(Name, Foot){
    override var color = "Green"

    override fun walk() {
        TODO("Not yet implemented")
    }

    override fun talk() {
        TODO("Not yet implemented")
    }
}
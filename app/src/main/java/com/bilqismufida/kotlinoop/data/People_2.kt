package com.bilqismufida.kotlinoop.data

//VISIBILITY SCOOP = Public, Protected, dan Private

open class People_2(var name : String, var age : Int){

    open val hobby = ""

    //public
    val id = ""

    //protected
    protected val id_2 = "ID PALSU"

    //Private
    private val bloodType = "A"

    fun absen(){
        println("$name sudah absen")
    }

    open fun breakTime(){
        println("$name sedang istirahat")
    }

    fun data(){
        println("ID nya = $id_2")
    }
}

class Teacher(name: String, age: Int, var subject : String) : People_2(name, age){
    override val hobby = ""

    override fun breakTime() {
        println("$name sedang istirahat di ruang guru")
    }

    fun teachersData(){
        println("ID gurunya adalah $id_2")
    }
}

class Student(name: String, age: Int, var level : String) : People_2(name, age){

}
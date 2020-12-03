package com.bilqismufida.kotlinoop.data

//Nested and Inner class

class People_3 {
    private val name = "Nama Orang"

    inner class Teacher{
        fun getName(){
            println(name)
        }
    }
}
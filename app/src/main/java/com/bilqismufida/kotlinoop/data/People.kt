package com.bilqismufida.kotlinoop.data

class People(var name: String, var age: Int){

    //Secondary Constructor
    constructor(name: String, age: Int, lastName: String)
             : this (name, age){
        this.name = name + lastName
    }

    fun berjalan(){
        println("Saya sedang berjalan")
    }
}
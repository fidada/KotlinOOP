package com.bilqismufida.kotlinoop.app

import com.bilqismufida.kotlinoop.data.Token

fun main() {
    //Extention Function

    fun String.addToken() : String{
        return "Barrier " + this
    }

    val token = "1293812"
    println(token.addToken())

    val person = Token()
    println(person.addData())
}
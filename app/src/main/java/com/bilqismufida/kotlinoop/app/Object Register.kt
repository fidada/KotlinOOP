package com.bilqismufida.kotlinoop.app

import com.bilqismufida.kotlinoop.data.Register

fun main() {
    //object
    val regisBilqis = Register(
        "itsBilqis",
        "who_is?",
        "bilqismufida207@gmail.com"
    )

    println(regisBilqis.username)
    println(regisBilqis.password)
    println(regisBilqis.email)
}
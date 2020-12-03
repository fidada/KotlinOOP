package com.bilqismufida.kotlinoop.app

import com.bilqismufida.kotlinoop.data.Toy

fun main() {
    val Andy = Toy(
        "Robot",
        250000
    )

    val Angela = Toy(
        "Doll"
    )

    println(Andy.toy_name)
    println(Andy.toy_price)
    println(Angela.toy_name)
    println(Angela.toy_price)
}
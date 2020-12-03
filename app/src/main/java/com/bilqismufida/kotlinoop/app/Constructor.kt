package com.bilqismufida.kotlinoop.app

import com.bilqismufida.kotlinoop.data.Car

fun main() {
    val avanza = Car(
        "Toyota"
    )

    val almaz = Car("Wuling", 2018)

    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)
}
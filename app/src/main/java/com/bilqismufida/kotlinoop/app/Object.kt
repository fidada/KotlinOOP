package com.bilqismufida.kotlinoop.app

import com.bilqismufida.kotlinoop.data.Person

fun main() {
    val haura = Person()
    haura.firstName = "Bilqis"

    val dina = Person()
    dina.firstName = "Dina"
    dina.midName = "Salsa"

    val bilqis = Person()
    bilqis.lastName = "Mufida"

    val acha = Person()
    acha.firstName = "Acha"

    val meisyell = Person()
    meisyell.firstName = "Meisyell"


    println(haura.firstName)

    println(dina.firstName)
    println(dina.midName)

    println(bilqis.lastName)

    println(acha.firstName)

    println(meisyell.firstName)
}
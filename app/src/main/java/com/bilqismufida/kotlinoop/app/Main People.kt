package com.bilqismufida.kotlinoop.app

import com.bilqismufida.kotlinoop.data.People

fun main() {
    val person = People("Bilqis Mufida", 13)
    person.berjalan()

    val person2 = People("Rizqi Alisha", 13, "Hendrawan")


    println("Biodata " + person.name + "Umurnya " + person.age)
    println("Biodata " + person2.name + "Umurnya " + person2.age)
}
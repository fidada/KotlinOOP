package com.bilqismufida.kotlinoop.app

import com.bilqismufida.kotlinoop.data.City
import com.bilqismufida.kotlinoop.data.Country

fun main() {
    val city = City("Bekasi")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)
}
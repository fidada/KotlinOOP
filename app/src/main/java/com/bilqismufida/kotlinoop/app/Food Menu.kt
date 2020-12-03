package com.bilqismufida.kotlinoop.app

import com.bilqismufida.kotlinoop.data.Food

fun main() {
    val foodMenu = Food(
        "French Fries",
        "Burger",
        "Ice Cream"
    )

    println(foodMenu.appetizers)
    println(foodMenu.main_food)
    println(foodMenu.dessert)
}
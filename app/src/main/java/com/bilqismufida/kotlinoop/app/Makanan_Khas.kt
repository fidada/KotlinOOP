package com.bilqismufida.kotlinoop.app

import com.bilqismufida.kotlinoop.data.asalMakanan
import com.bilqismufida.kotlinoop.data.namaMakanan

fun main() {
    val namaMakanan_Khas = namaMakanan("Tude Bakar")
    val asalMakanan_Khas = asalMakanan("Manado")

    println(namaMakanan_Khas.name)
    println(asalMakanan_Khas.name)
}
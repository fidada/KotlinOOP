package com.bilqismufida.kotlinoop.app

import com.bilqismufida.kotlinoop.data.asal
import com.bilqismufida.kotlinoop.data.namaRumah

fun main() {
    val namaRumah_Adat = namaRumah("Rumah Gadang")
    val asalRumah_Adat = asal("Minangkabau")


    println(namaRumah_Adat.name)
    println(asalRumah_Adat.name)
}
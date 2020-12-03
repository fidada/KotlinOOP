package com.bilqismufida.kotlinoop.app

import com.bilqismufida.kotlinoop.data.Teacher

fun main() {
    var Bob = Teacher("Mr. Bob", 45, "Math")
    Bob.absen()
    Bob.breakTime()
    Bob.id
//    Bob.id_2 = error kalo pake protected
    println(Bob.teachersData())
    println(Bob.data())
//    println(Bob.bloodtype) = error kalo pake private

    var Student1 = Teacher("Bilqis", 13, "90")
    Student1.absen()
    Student1.breakTime()
}
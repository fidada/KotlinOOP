package com.bilqismufida.kotlinoop.data

class Biodata(firstName : String, lastName : String, age : Int) {
    var age = age
    var firstName = firstName
    var lastName = lastName

    //Setter and Getter
    var name : String
    get() = firstName + " " + lastName
    set(value) {
        val fullName = value.split(" ")
        firstName = fullName[0]
        lastName = fullName[1]
    }

    init {
        println("Kelas biodata berhasil dibuat...")
    }

    init {
        if (age <= 0){
            println("Hey tydack bowleh")
        }else{
            print("")
        }
    }
}
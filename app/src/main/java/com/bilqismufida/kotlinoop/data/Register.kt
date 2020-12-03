package com.bilqismufida.kotlinoop.data

class Register(usernameParam : String,
               passwordParam : String?,
               emailParam : String) {

    //properties
    var username : String = usernameParam
    var password : String? = passwordParam
    var email : String = emailParam
}
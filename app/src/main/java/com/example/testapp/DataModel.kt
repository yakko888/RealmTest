package com.example.testapp

import io.realm.RealmObject

open class DataModel: RealmObject() {

    var id  = 0
    var name: String? = null
    var email:String? = null
}
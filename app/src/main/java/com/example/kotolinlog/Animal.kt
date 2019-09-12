package com.example.kotolinlog

    abstract class Animal{
    //プロパティ
    var name:String = ""
    var age: Int = 0
    private var hobby: String=""

    //引数付きコンストラクタ
    constructor(name:String, age:Int){
        this.name = name
        this.age = age
    }

    //引数付きコンストラクタ
    constructor(hobby:String){
        this.hobby = hobby
    }

    abstract fun say()
}
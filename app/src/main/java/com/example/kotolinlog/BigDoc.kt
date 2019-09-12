package com.example.kotolinlog

import android.util.Log


class BigDoc:Dog {

    //superで親クラスのコンストラクタを呼ぶ
    constructor(name:String, age: Int):super(name,age){
    }

    override fun say(){
        super.say()
        Log.d("kotlintest","大きな犬です。")
    }

}
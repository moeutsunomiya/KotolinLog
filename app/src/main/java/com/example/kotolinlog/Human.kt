package com.example.kotolinlog

import android.util.Log

class Human:Animal,Thinkable{

    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age) {
    }

    // 引数付きコンストラクタ
    constructor(hobby : String):super(hobby){
        this.hobby=hobby
    }

    override fun say() {
        Log.d("kotlintest","私の名前は"+ name + "です。")
        Log.d("kotlintest","年は"+ age + "歳です。")
    }

    override fun think() {
        Log.d("kotlintest","私は"+ hobby + "について考える。")

    }

}
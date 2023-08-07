package com.example.step08_customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.step08customview.MyView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //MyView 객체를 생성해서 전달하기
        //
        //
        //
        // setContentView(MyView(this))

        //layout xml 문서를 이용해서 MyView 객체를 사용하려면
        // Context 와 Attribute 객체를 인자로 전달받는
        // 존재해야 한다.
        //setContentView(R.layout.activity_main)
        setContentView((R.layout.activity_main))
    }
}
package com.example.step07sqlite2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import com.example.step07sqlite2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() , OnClickListener {// extends AppComptActivity
    lateinit var  binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //getLayoutInflater() 대신에 layoutInflater 라고 작성하면 된다
        binding= ActivityMainBinding.inflate(layoutInflater)
        //레이아웃 구성하기
        setContentView(binding!!.root)
        //Button 에 리스너 등록
        binding.senBtn.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        //입력한 문자열을 읽어와서 .getText() 대신에 .text
        val msg=binding.inputMsg.text.toString()
        //Toast 깨우기
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
    }
}
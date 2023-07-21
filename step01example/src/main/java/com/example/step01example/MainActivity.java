package com.example.step01example;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //버튼 전송값 가져오기
        Button changeBtn=findViewById(R.id.sendBtn);
        //버튼에 onClickListener 적용하기
        changeBtn.setOnClickListener(this);


        //전송 2 버튼을 다른 형식으로 구현하기
        Button sendBtn2=findViewById(R.id.sendBtn2);
        sendBtn2.setOnClickListener(view ->{
            //EditText 에 입력한 값 가져오기
            EditText editText=findViewById(R.id.editText);
            //String으로 casting 해주기
            String e=editText.getText().toString();
            //TextView 값 가져오기
            TextView tv=findViewById(R.id.textView2);
            //TextView 값에 PlainText 적용하기
            //CharSequence 값은 String 값과 동일
            tv.setText(e);
        });
    }

    @Override
    public void onClick(View view) {
        //EditText 에 입력한 값 가져오기
        EditText editText=findViewById(R.id.editText);
        //String으로 casting 해주기
        String e=editText.getText().toString();
        //TextView 값 가져오기
        TextView tv=findViewById(R.id.textView2);
        //TextView 값에 PlainText 적용하기
        //CharSequence 값은 String 값과 동일
        tv.setText(e);
    }
}
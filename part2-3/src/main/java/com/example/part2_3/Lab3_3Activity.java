package com.example.part2_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lab3_3Activity extends AppCompatActivity implements View.OnClickListener{

    Button trueBtn;
    TextView targetTextView;
    Button falseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_3);

        trueBtn = (Button) findViewById(R.id.btn_visible_true);
        targetTextView = (TextView) findViewById(R.id.text_visible_target);
        falseBtn = (Button) findViewById(R.id.btn_visible_false);
        // Button 이벤트 등록
        trueBtn.setOnClickListener(this);
        falseBtn.setOnClickListener(this);
    }

    // 버튼 이벤트 콜백함수
    @Override
    public void onClick(View v){
        if(v == trueBtn){
            targetTextView.setVisibility(View.VISIBLE);
        }else if(v == falseBtn){
            targetTextView.setVisibility((View.INVISIBLE));
        }
    }
}

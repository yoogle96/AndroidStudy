package com.example.part2_3;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lab3_4Activity extends AppCompatActivity {

    CheckBox checkbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_4);

        //Custom Font 적용
        TextView textView = (TextView)findViewById(R.id.fontView);
//        Typeface typeface = Typeface.createFromAsset(getAssets(), "xmas.ttf");
//        textView.setTypeface(typeface);

        //CheckBox 이벤트 프로그램
        checkbox = (CheckBox)findViewById(R.id.checkbox);
        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    checkbox.setText("is Checked");
                }else{
                    checkbox.setText("is unChecked");
                }
            }
        });
    }
}

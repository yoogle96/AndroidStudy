package com.example.part2_7;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=(ImageView)findViewById(R.id.img);
        // 애니메이션 획득
        Animation anims = AnimationUtils.loadAnimation(this, R.anim.in);
        anims.setAnimationListener(new Animation.AnimationListener(){
            @Override
            public void onAnimationStart(Animation animation){

            }

            @Override
            public void onAnimationEnd(Animation animation){
                Animation anim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.move);
                anim.setFillAfter(true);
                imageView.startAnimation(anim);
            }
            @Override
            public void onAnimationRepeat(Animation animation){

            }
        });

        imageView.startAnimation(anims);

    }
}

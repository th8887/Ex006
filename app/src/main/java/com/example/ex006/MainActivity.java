package com.example.ex006;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton ivbtn;
    ImageView iv;
    int p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p=0;
        ivbtn=(ImageButton) findViewById(R.id.ivbtn);
        iv=(ImageView) findViewById(R.id.iv);
        ivbtn.setImageResource(R.drawable.text001);
    }
public static Random rnd =new Random();
    public void numbers(View view) {
        p=rnd.nextInt(3)+1;
        if(p==1){
            ivbtn.setImageResource(R.drawable.one);
            iv.setImageResource(R.drawable.android001);
        }
        if(p==2){
            ivbtn.setImageResource(R.drawable.two);
            iv.setImageResource(R.drawable.android002);
        }
        if(p==3){
            ivbtn.setImageResource(R.drawable.three);
            iv.setImageResource(R.drawable.android003);
        }
    }
}

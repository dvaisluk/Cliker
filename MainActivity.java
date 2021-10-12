package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    long count = 0;
    ImageButton button3;
    TextView textView;
    Button button2;
    Button button1;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button3 = (ImageButton) findViewById(R.id.imageButton11);
        textView = (TextView) findViewById(R.id.mainTxt);
        button2 = (Button) findViewById(R.id.minus_btn);
        button1 = (Button) findViewById(R.id.plus_btn);
        OnClick();

    }
    void translate(){
        if (count%10==2 || count%10==3 || count%10==4){
            if (count%100 < 10 || count%100>20) {
                text = " раза";
            }
        }
        else{
            text = " раз";
        }
    }
    @SuppressLint("SetTextI18n")
    void OnClick(){
        button1.setOnClickListener(view -> {
            count ++;
            translate();
            textView.setText(count + text);
        });
        button2.setOnClickListener(view -> {
            if (count > 0){
                count --;
                translate();
                textView.setText(count + text);
            }
        });
        button3.setOnClickListener(view -> {
            count = 0;
            translate();
            textView.setText(count + text);
        });
    }

}

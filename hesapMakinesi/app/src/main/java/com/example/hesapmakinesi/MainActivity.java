package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void matematik(View view){
        Intent intent = new Intent(MainActivity.this,MatematikActivity.class);
        startActivity(intent);
    }

    public void uzunluk(View view){
        Intent intent = new Intent(MainActivity.this,UzunlukActivity.class);
        startActivity(intent);
    }

    public void scale(View view){
        Intent intent = new Intent(MainActivity.this,ScaleActivity.class);
        startActivity(intent);
    }

    public void timer(View view){
        Intent intent = new Intent(MainActivity.this,TimerActivity.class);
        startActivity(intent);
    }

    public void tempereture(View view){
        Intent intent = new Intent(MainActivity.this,TemperetureActivity.class);
        startActivity(intent);
    }

    public void translate(View view){
        Intent intent = new Intent(MainActivity.this,MoneyCurrencyActivity.class);
        startActivity(intent);
    }
}

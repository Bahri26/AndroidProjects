package com.bahrikoc.multiplyactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView2);
        Intent ıntent = getIntent();
        String userName = ıntent.getStringExtra("userInput");
        textView.setText(userName);
    }

    public void changeScreen(View view){
        Intent ıntent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(ıntent);
    }
}

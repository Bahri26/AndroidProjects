package com.bahrikoc.catchthekanny;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView scoreText;
    TextView timeText;
    int score;
    ImageView ımageView;
    ImageView ımageView2;
    ImageView ımageView3;
    ImageView ımageView4;
    ImageView ımageView5;
    ImageView ımageView6;
    ImageView ımageView7;
    ImageView ımageView8;
    ImageView ımageView9;
    ImageView[] imageArray;
    Handler handler;
    Runnable runnable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeText = findViewById(R.id.timeText);
        scoreText = findViewById(R.id.scoreText);

        ımageView = findViewById(R.id.imageView);
        ımageView2 = findViewById(R.id.imageView1);
        ımageView3 = findViewById(R.id.imageView2);
        ımageView4 = findViewById(R.id.imageView3);
        ımageView5 = findViewById(R.id.imageView4);
        ımageView6 = findViewById(R.id.imageView5);
        ımageView7 = findViewById(R.id.imageView6);
        ımageView8 = findViewById(R.id.imageView7);
        ımageView9 = findViewById(R.id.imageView8);

        imageArray = new ImageView[]{ımageView,ımageView2,ımageView3,ımageView4,ımageView5,ımageView6,ımageView7,ımageView8,ımageView9};

        hideImages();
        score=0;

        new CountDownTimer(10000, 100) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeText.setText("Time: "+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                timeText.setText("Time off");
                handler.removeCallbacks(runnable);
                for (ImageView image:imageArray) {
                    image.setVisibility(View.INVISIBLE);
                }

                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Restart?");
                alert.setMessage("Are you to restart game?");
                alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent ıntent = getIntent();
                        finish();
                        startActivity(ıntent);
                    }
                });

                alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Game over!",Toast.LENGTH_SHORT).show();
                    }
                });
                alert.show();
            }
        }.start();
    }

    public void increaseScore(View view){
        score++;
        scoreText.setText("Score: "+score);
    }

    public void hideImages(){
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                for (ImageView image:imageArray) {
                    image.setVisibility(View.INVISIBLE);
                }

                Random random = new Random();
                int i=random.nextInt(9);
                imageArray[i].setVisibility(View.VISIBLE);
                handler.postDelayed(this,500);
            }
        };

        handler.post(runnable);
     }
}


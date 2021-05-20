package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class TimerActivity extends AppCompatActivity {

    int hour,minute,second;
    long START_TIME_IN_MILLIS=0;
    TextView mTextViewCountDown;
    Button mButtonStartPause,mButtonStartPause2,mButtonReset,mButtonReset2;
    CountDownTimer mCountDownTimer;
    boolean mTimerRunning;
    long mTimeLeftInMillis=0;
    Toast toast;
    Spinner spinner2,spinner3;
    TextView textView,textView3,textView4;

    String [] timer2 = {"Seçiniz","00","01","02","03","04","05","06","07","08","08","09","10","11","12","13","14","15","16","17","18","19",
            "20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42",
    "43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);


        textView = findViewById(R.id.textView);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        spinner2 = findViewById(R.id.spinner6);
        spinner3 = findViewById(R.id.spinner7);
        mButtonStartPause2 = findViewById(R.id.button_start_pause2);
        mButtonReset2 = findViewById(R.id.button_reset2);
        mButtonStartPause2.setVisibility(View.INVISIBLE);
        mButtonReset2.setVisibility(View.INVISIBLE);

        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,timer2);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter1);
        spinner3.setAdapter(arrayAdapter1);


        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                minute = position;
                String dakika = String.valueOf(minute);
                if(dakika.startsWith("0")){
                    minute = dakika.indexOf(1);
                }

                START_TIME_IN_MILLIS = minute * 60000;
                mTimeLeftInMillis = mTimeLeftInMillis + START_TIME_IN_MILLIS;

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                second = position;
                String saniye = String.valueOf(second);
                if(saniye.startsWith("0")){
                    minute = saniye.indexOf(1);
                }
                START_TIME_IN_MILLIS = second * 1000;
                mTimeLeftInMillis = mTimeLeftInMillis + START_TIME_IN_MILLIS;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



            mTextViewCountDown = findViewById(R.id.text_view_countdown);
            mButtonStartPause = findViewById(R.id.button_start_pause);
            mButtonReset = findViewById(R.id.button_reset);
            mButtonStartPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mTimerRunning) {
                        pauseTimer();
                    } else {
                        startTimer();
                    }
                }
            });
            mButtonReset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    resetTimer();
                }
            });
            updateCountDownText();
        }
        public void startTimer() {
            mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    mTimeLeftInMillis = millisUntilFinished;
                    updateCountDownText();
                }
                @Override
                public void onFinish() {
                    mTimerRunning = false;
                    mButtonStartPause.setText("Start");
                    mButtonStartPause.setVisibility(View.INVISIBLE);
                    mButtonReset.setVisibility(View.VISIBLE);
                }
            }.start();
            mTimerRunning = true;
            mButtonStartPause.setText("pause");
            mButtonReset.setVisibility(View.INVISIBLE);
        }
        public void pauseTimer() {
            mCountDownTimer.cancel();
            mTimerRunning = false;
            mButtonStartPause.setText("Start");
            mButtonReset.setVisibility(View.VISIBLE);
        }
        public void resetTimer() {
            START_TIME_IN_MILLIS = 0;
            mTimeLeftInMillis = START_TIME_IN_MILLIS;
            finish();
            mButtonReset.setVisibility(View.INVISIBLE);
            mButtonStartPause.setVisibility(View.VISIBLE);
        }

        public void finish(){
            int minutes = 0;
            int seconds = 0;
            String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
            mTextViewCountDown.setText(timeLeftFormatted);
            spinner2.setVisibility(View.INVISIBLE);
            spinner3.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            textView4.setVisibility(View.INVISIBLE);
            mButtonReset2.setVisibility(View.VISIBLE);
            mButtonStartPause2.setVisibility(View.VISIBLE);

            textView.setText("Çıkmak istiyor musunuz?");
            mButtonStartPause2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(TimerActivity.this,MainActivity.class);
                    startActivity(intent);
                }
            });
            mButtonReset2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(TimerActivity.this,TimerActivity.class);
                    startActivity(intent);
                }
            });

        }
        public void updateCountDownText() {
            int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
            int seconds = (int) (mTimeLeftInMillis / 1000) % 60;
            String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
            mTextViewCountDown.setText(timeLeftFormatted);
        }
}


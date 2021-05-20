package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class TemperetureActivity extends AppCompatActivity {

    TextView textView,textView2;
    Button btnsifir,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnNokta;
    String [] tempereture = {"Seçiniz","Celcious","Fahrenheit","Kelvin"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempereture);

        textView = findViewById(R.id.textView2);textView2 = findViewById(R.id.textView5);btnsifir = findViewById(R.id.button8);
        btn1 = findViewById(R.id.button4);btn2 = findViewById(R.id.button7);btn3 = findViewById(R.id.button12);
        btnNokta = findViewById(R.id.button13);btn4 = findViewById(R.id.button3);btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button11);btn7 = findViewById(R.id.button);btn8 = findViewById(R.id.button2);
        btn9 = findViewById(R.id.button10);

        final Spinner spinner1 = findViewById(R.id.spinner5);
        final Spinner spinner2 = findViewById(R.id.spinner8);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,tempereture);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(arrayAdapter);
        spinner2.setAdapter(arrayAdapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(tempereture[position] == "Celcious"){
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        Double sayi = Double.valueOf(textView.getText().toString());
                        double toplam=0;
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if(tempereture[position] == "Fahrenheit"){
                                sayi = 1.8*sayi + 32;
                                String translate = String.valueOf(sayi);
                                textView2.setText(translate);
                            }

                            if(tempereture[position] == "Kelvin"){
                                sayi = sayi + 273;
                                String translate = String.valueOf(sayi);
                                textView2.setText(translate);
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }

                if(tempereture[position] == "Fahrenheit"){
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        Double sayi = Double.valueOf(textView.getText().toString());
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if(tempereture[position] == "Celcious"){
                                sayi = (sayi - 32)/ (1.8);
                                String translate = String.valueOf(sayi);
                                textView2.setText(translate);
                            }

                            if(tempereture[position] == "Kelvin"){
                                sayi = ((sayi - 32)/(1.8))+273;
                                String translate = String.valueOf(sayi);
                                textView2.setText(translate);
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });

                }

                if(tempereture[position] == "Kelvin"){
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        Double sayi = Double.valueOf(textView.getText().toString());
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if(tempereture[position] == "Celcious"){
                                sayi = sayi - 273;
                                String translate = String.valueOf(sayi);
                                textView2.setText(translate);
                            }

                            if(tempereture[position] == "Fahrenheit"){
                                sayi = (1.8 * (sayi-273)) + 32;
                                String translate = String.valueOf(sayi);
                                textView2.setText(translate);
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void Sifir(View view){
        if(textView.getText().charAt(0) == '0'){
            textView.setText("");
        }
        textView.setText(textView.getText().toString() +btnsifir.getText().toString());
    }

    public void Bir(View view){
        if(textView.getText().toString().endsWith("0")) {
            textView.setText(textView.getText().toString().substring(1,textView.getText().length()));
            if (textView.getText().toString().endsWith("0.")) {
                textView.setText(textView.getText().toString() + btn1.getText().toString());
            } else {
                textView.setText(textView.getText().toString() + btn1.getText().toString());
            }
        }

        else {
            textView.setText(textView.getText().toString() + btn1.getText().toString());
        }

    }

    public void Iki(View view){
        if(textView.getText().toString().endsWith("0")) {
            textView.setText(textView.getText().toString().substring(1, textView.getText().length()));
            if (textView.getText().toString().endsWith("0.")) {
                textView.setText(textView.getText().toString() + btn2.getText().toString());
            } else {
                textView.setText(textView.getText().toString() + btn2.getText().toString());
            }
        }

        else {
            textView.setText(textView.getText().toString() + btn2.getText().toString());
        }
    }

    public void Uc(View view){
        if(textView.getText().toString().endsWith("0")) {
            textView.setText(textView.getText().toString().substring(1, textView.getText().length()));
            if (textView.getText().toString().endsWith("0.")) {
                textView.setText(textView.getText().toString() + btn3.getText().toString());
            } else {
                textView.setText(textView.getText().toString() + btn3.getText().toString());
            }
        }

        else {
            textView.setText(textView.getText().toString() + btn3.getText().toString());
        }
    }

    public void Dort(View view){
        if(textView.getText().toString().endsWith("0")) {
            textView.setText(textView.getText().toString().substring(1, textView.getText().length()));
            if (textView.getText().toString().endsWith("0.")) {
                textView.setText(textView.getText().toString() + btn4.getText().toString());
            } else {
                textView.setText(textView.getText().toString() + btn4.getText().toString());
            }
        }

        else {
            textView.setText(textView.getText().toString() + btn4.getText().toString());
        }
    }

    public void Bes(View view){
        if(textView.getText().toString().endsWith("0")) {
            textView.setText(textView.getText().toString().substring(1, textView.getText().length()));
            if (textView.getText().toString().endsWith("0.")) {
                textView.setText(textView.getText().toString() + btn5.getText().toString());
            } else {
                textView.setText(textView.getText().toString() + btn5.getText().toString());
            }
        }

        else {
            textView.setText(textView.getText().toString() + btn5.getText().toString());
        }
    }

    public void Alti(View view){
        if(textView.getText().toString().endsWith("0")) {
            textView.setText(textView.getText().toString().substring(1, textView.getText().length()));
            if (textView.getText().toString().endsWith("0.")) {
                textView.setText(textView.getText().toString() + btn6.getText().toString());
            } else {
                textView.setText(textView.getText().toString() + btn6.getText().toString());
            }
        }

        else {
            textView.setText(textView.getText().toString() + btn6.getText().toString());
        }
    }

    public void Yedi(View view){
        if(textView.getText().toString().endsWith("0")) {
            textView.setText(textView.getText().toString().substring(1, textView.getText().length()));
            if (textView.getText().toString().endsWith("0.")) {
                textView.setText(textView.getText().toString() + btn7.getText().toString());
            } else {
                textView.setText(textView.getText().toString() + btn7.getText().toString());
            }
        }

        else {
            textView.setText(textView.getText().toString() + btn7.getText().toString());
        }
    }

    public void Sekiz(View view){
        if(textView.getText().toString().endsWith("0")) {
            textView.setText(textView.getText().toString().substring(1, textView.getText().length()));
            if (textView.getText().toString().endsWith("0.")) {
                textView.setText(textView.getText().toString() + btn8.getText().toString());
            } else {
                textView.setText(textView.getText().toString() + btn8.getText().toString());
            }
        }
        else {
            textView.setText(textView.getText().toString() + btn8.getText().toString());
        }
    }

    public void Dokuz(View view){
        if(textView.getText().toString().endsWith("0")) {
            textView.setText(textView.getText().toString().substring(1, textView.getText().length()));
            if (textView.getText().toString().endsWith("0.")) {
                textView.setText(textView.getText().toString() + btn9.getText().toString());
            } else {
                textView.setText(textView.getText().toString() + btn9.getText().toString());
            }
        }
        else {
            textView.setText(textView.getText().toString() + btn9.getText().toString());
        }
    }

    public void Sil(View view){
        textView.setText("0");
        textView2.setText("0");
    }

    public void Ce(View view){
        if(textView.getText().equals("")){
            textView.setText("0");

        }

        else {
            if (textView.getText().length() != 1) {
                textView.setText(textView.getText().toString().substring(0, textView.getText().length() - 1));
            } else {
                textView.setText("0");
            }
        }

    }

    public void Nokta(View view) {
        if(textView.getText().toString() == "0"){
            textView.setText(textView.getText() + btnNokta.getText().toString());
        }

        else{
            textView.setText(textView.getText() + btnNokta.getText().toString());
        }

    }

}

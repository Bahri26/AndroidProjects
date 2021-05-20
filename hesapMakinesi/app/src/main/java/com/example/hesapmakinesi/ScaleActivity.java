package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class ScaleActivity extends AppCompatActivity {

    TextView textView,textView2;
    String [] height = {"Seçiniz","kilogram","hektogram","dekagram","gram","desigram","santigram","miligram"};

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnsifir,btnNokta,btnSil,btnCE;
    int decimalclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);

        final Spinner spinner1 = findViewById(R.id.spinner3);
        final Spinner spinner2 = findViewById(R.id.spinner4);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,height);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(arrayAdapter);
        spinner2.setAdapter(arrayAdapter);
        btn1 = findViewById(R.id.btn1);btn2= findViewById(R.id.btn2);btn3=findViewById(R.id.btn3);btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);btn6 = findViewById(R.id.btn6);btn7=findViewById(R.id.btn7);btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);btnNokta = findViewById(R.id.nokta);btnSil = findViewById(R.id.sil);btnCE = findViewById(R.id.btnCE);
        btnsifir = findViewById(R.id.sifir);textView = findViewById(R.id.sonuc3);textView2 = findViewById(R.id.sonuc4);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(height[position] == "kilogram"){
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            Double sayi = Double.valueOf(textView.getText().toString());
                            if(height[position] == "hektogram"){
                                sayi = sayi * 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "dekagram"){
                                sayi = sayi * 100;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);

                            }

                            if(height[position] == "gram"){
                                sayi = sayi * 1000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "desigram"){
                                sayi = sayi * 10000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "santigram"){
                                sayi = sayi * 100000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "miligram"){
                                sayi = sayi * 1000000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(textView2.getText().toString().endsWith("0")){
                                textView2.setText(textView2.getText().toString().substring(0,textView2.getText().toString().length()-2));
                            }
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }

                    });
                }

                if(height[position] == "hektogram"){
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            Double sayi = Double.valueOf(textView.getText().toString());
                            if(height[position] == "kilogram"){
                                sayi = sayi / 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "dekagram"){
                                sayi = sayi * 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);

                            }

                            if(height[position] == "gram"){
                                sayi = sayi * 100;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "desigram"){
                                sayi = sayi * 1000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "santigram"){
                                sayi = sayi * 10000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "miligram"){
                                sayi = sayi * 100000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(textView2.getText().toString().endsWith("0")){
                                textView2.setText(textView2.getText().toString().substring(0,textView2.getText().toString().length()-2));
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }

                if(height[position] == "dekagram"){
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            Double sayi = Double.valueOf(textView.getText().toString());
                            if(height[position] == "kilogram"){
                                sayi = sayi / 100;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "hektogram"){
                                sayi = sayi / 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);

                            }

                            if(height[position] == "gram"){
                                sayi = sayi * 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "desigram"){
                                sayi = sayi * 100;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "santigram"){
                                sayi = sayi * 1000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "miligram"){
                                sayi = sayi * 10000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(textView2.getText().toString().endsWith("0")){
                                textView2.setText(textView2.getText().toString().substring(0,textView2.getText().toString().length()-2));
                            }

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }

                if(height[position] == "gram"){
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            Double sayi = Double.valueOf(textView.getText().toString());
                            if(height[position] == "kilogram"){
                                sayi = sayi / 1000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "hektogram"){
                                sayi = sayi / 100;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);

                            }

                            if(height[position] == "dekagram"){
                                sayi = sayi / 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "desigram"){
                                sayi = sayi * 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "santigram"){
                                sayi = sayi * 100;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "miligram"){
                                sayi = sayi * 1000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(textView2.getText().toString().endsWith("0")){
                                textView2.setText(textView2.getText().toString().substring(0,textView2.getText().toString().length()-2));
                            }

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }

                if(height[position] == "desigram"){
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            Double sayi = Double.valueOf(textView.getText().toString());
                            if(height[position] == "kilogram"){
                                sayi = sayi / 10000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "hektogram"){
                                sayi = sayi / 1000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);

                            }

                            if(height[position] == "dekagram"){
                                sayi = sayi / 100;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "gram"){
                                sayi = sayi / 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "santigram"){
                                sayi = sayi * 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "miligram"){
                                sayi = sayi * 100;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(textView2.getText().toString().endsWith("0")){
                                textView2.setText(textView2.getText().toString().substring(0,textView2.getText().toString().length()-2));
                            }

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }

                if(height[position] == "santigram"){
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            Double sayi = Double.valueOf(textView.getText().toString());
                            if(height[position] == "kilogram"){
                                sayi = sayi / 100000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "hektogram"){
                                sayi = sayi / 10000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);

                            }

                            if(height[position] == "dekagram"){
                                sayi = sayi / 1000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "gram"){
                                sayi = sayi / 100;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "desigram"){
                                sayi = sayi / 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "miligram"){
                                sayi = sayi * 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(textView2.getText().toString().endsWith("0")){
                                textView2.setText(textView2.getText().toString().substring(0,textView2.getText().toString().length()-2));
                            }

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }

                if(height[position] == "miligram"){
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            Double sayi = Double.valueOf(textView.getText().toString());
                            if(height[position] == "kilogram"){
                                sayi = sayi / 1000000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "hektogram"){
                                sayi = sayi / 100000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);

                            }

                            if(height[position] == "dekagram"){
                                sayi = sayi / 10000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "gram"){
                                sayi = sayi / 1000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "desigram"){
                                sayi = sayi / 100;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "santigram"){
                                sayi = sayi / 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(textView2.getText().toString().endsWith("0")){
                                textView2.setText(textView2.getText().toString().substring(0,textView2.getText().toString().length()-2));
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

    public void sifirS(View view){
        if(textView.getText().charAt(0) == '0'){
            textView.setText("");
        }
        textView.setText(textView.getText().toString() +btnsifir.getText().toString());
    }

    public void birS(View view){
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

    public void ikiS(View view){
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

    public void ucS(View view){
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

    public void dortS(View view){
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

    public void besS(View view){
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

    public void altiS(View view){
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

    public void yediS(View view){
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

    public void sekizS(View view){
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

    public void dokuzS(View view){
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

    public void silS(View view){
        textView.setText("0");
        textView2.setText("0");
    }

    public void CES(View view){
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

    public void noktaS(View view) {
        if (textView.getText().toString() == "0") {
            textView.setText(textView.getText() + btnNokta.getText().toString());
        } else {
            textView.setText(textView.getText() + btnNokta.getText().toString());
        }
    }
}

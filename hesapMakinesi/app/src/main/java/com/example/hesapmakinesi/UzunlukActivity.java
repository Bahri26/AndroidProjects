package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class UzunlukActivity extends AppCompatActivity{

    TextView textView,textView2;
    String [] height = {"Seçiniz","km","hk","dam","m","dm","cm","mm"};

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnsifir,btnNokta,btnSil,btnCE;
    int decimalclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uzunluk);
        textView = findViewById(R.id.sonuc);
        textView2 = findViewById(R.id.sonuc2);
        btn1 = findViewById(R.id.Bir);btn2 = findViewById(R.id.BtnIki);btn3 = findViewById(R.id.Uc);
        btn4 = findViewById(R.id.Dort);btn5 = findViewById(R.id.btnbes);btn6 = findViewById(R.id.btnalti);
        btn7 = findViewById(R.id.btnYedi);btn8 = findViewById(R.id.btnSekiz);btn9 = findViewById(R.id.btndokuz);
        btnNokta = findViewById(R.id.btnNokta);btnSil = findViewById(R.id.btnsil);btnCE = findViewById(R.id.btnce);
        btnsifir = findViewById(R.id.btnsifir);



        final Spinner spinner = findViewById(R.id.spinner);
        final Spinner spinner2 = findViewById(R.id.spinner2);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,height);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner2.setAdapter(arrayAdapter);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               if(height[position] == "km"){
                   spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                       @Override
                       public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                           Double sayi = Double.valueOf(textView.getText().toString());
                           if(height[position] == "hk"){
                               sayi = sayi * 10;
                               String metin = String.valueOf(sayi);
                               textView2.setText(metin);
                           }

                           if(height[position] == "dam"){
                                sayi = sayi * 100;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);

                           }

                           if(height[position] == "m"){
                               sayi = sayi * 1000;
                               String metin = String.valueOf(sayi);
                               textView2.setText(metin);
                           }

                           if(height[position] == "dm"){
                               sayi = sayi * 10000;
                               String metin = String.valueOf(sayi);
                               textView2.setText(metin);
                           }

                           if(height[position] == "cm"){
                               sayi = sayi * 100000;
                               String metin = String.valueOf(sayi);
                               textView2.setText(metin);
                           }

                           if(height[position] == "mm"){
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

                if(height[position] == "hk"){
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            Double sayi = Double.valueOf(textView.getText().toString());
                            if(height[position] == "km"){
                                sayi = sayi / 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "dam"){
                                sayi = sayi * 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);

                            }

                            if(height[position] == "m"){
                                sayi = sayi * 100;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "dm"){
                                sayi = sayi * 1000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "cm"){
                                sayi = sayi * 10000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "mm"){
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

                if(height[position] == "dam"){
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            Double sayi = Double.valueOf(textView.getText().toString());
                            if(height[position] == "km"){
                                sayi = sayi / 100;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "hk"){
                                sayi = sayi / 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);

                            }

                            if(height[position] == "m"){
                                sayi = sayi * 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "dm"){
                                sayi = sayi * 100;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "cm"){
                                sayi = sayi * 1000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "mm"){
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

                if(height[position] == "m"){
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            Double sayi = Double.valueOf(textView.getText().toString());
                            if(height[position] == "km"){
                                sayi = sayi / 1000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "hk"){
                                sayi = sayi / 100;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);

                            }

                            if(height[position] == "dam"){
                                sayi = sayi / 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "dm"){
                                sayi = sayi * 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "cm"){
                                sayi = sayi * 100;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "mm"){
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

                if(height[position] == "dm"){
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            Double sayi = Double.valueOf(textView.getText().toString());
                            if(height[position] == "km"){
                                sayi = sayi / 10000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "hk"){
                                sayi = sayi / 1000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);

                            }

                            if(height[position] == "dam"){
                                sayi = sayi / 100;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "m"){
                                sayi = sayi / 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "cm"){
                                sayi = sayi * 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "mm"){
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

                if(height[position] == "cm"){
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            Double sayi = Double.valueOf(textView.getText().toString());
                            if(height[position] == "km"){
                                sayi = sayi / 100000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "hk"){
                                sayi = sayi / 10000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);

                            }

                            if(height[position] == "dam"){
                                sayi = sayi / 1000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "m"){
                                sayi = sayi / 100;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "dm"){
                                sayi = sayi / 10;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "mm"){
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

                if(height[position] == "mm"){
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            Double sayi = Double.valueOf(textView.getText().toString());
                            if(height[position] == "km"){
                                sayi = sayi / 1000000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "hk"){
                                sayi = sayi / 100000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);

                            }

                            if(height[position] == "dam"){
                                sayi = sayi / 10000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "m"){
                                sayi = sayi / 1000;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "dm"){
                                sayi = sayi / 100;
                                String metin = String.valueOf(sayi);
                                textView2.setText(metin);
                            }

                            if(height[position] == "cm"){
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

    public void sifir(View view){
        if(textView.getText().charAt(0) == '0'){
            textView.setText("");
        }
        textView.setText(textView.getText().toString() +btnsifir.getText().toString());
    }

    public void bir(View view){
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

    public void iki(View view){
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

    public void uc(View view){
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

    public void dort(View view){
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

    public void bes(View view){
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

    public void alti(View view){
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

    public void yedi(View view){
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

    public void sekiz(View view){
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

    public void dokuz(View view){
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

    public void sil(View view){
        textView.setText("0");
        textView2.setText("0");
    }

    public void CE(View view){
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

    public void nokta(View view) {
        if(textView.getText().toString() == "0"){
            textView.setText(textView.getText() + btnNokta.getText().toString());
        }

        else{
            textView.setText(textView.getText() + btnNokta.getText().toString());
        }

    }




}

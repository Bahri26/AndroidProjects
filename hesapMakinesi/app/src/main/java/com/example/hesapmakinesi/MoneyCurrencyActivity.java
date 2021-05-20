package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MoneyCurrencyActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnsifir,btnNokta,btnSil,btnCE;
    TextView txtSonuc,txtSonuc2;
    Spinner spinner1,spinner2;
    String [] currency = {"Seçiniz","Avro","Dolar","Sterlin","TL"};
    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_currency);

        btnsifir = findViewById(R.id.button22);btn1=findViewById(R.id.button17);btn2=findViewById(R.id.button21);
        btn3 = findViewById(R.id.button26);btn4= findViewById(R.id.button16);btn5=findViewById(R.id.button20);
        btn6=findViewById(R.id.button25);btn7=findViewById(R.id.button15);btn8=findViewById(R.id.button19);
        btn9=findViewById(R.id.button24);btnCE = findViewById(R.id.button18);btnSil=findViewById(R.id.button23);
        btnNokta=findViewById(R.id.button28);

        txtSonuc = findViewById(R.id.textView6);
        txtSonuc2= findViewById(R.id.textView7);
        spinner1 = findViewById(R.id.spinner9);
        spinner2 = findViewById(R.id.spinner10);
        imageView1 = findViewById(R.id.imageView13);
        imageView2 = findViewById(R.id.imageView14);
        imageView3 = findViewById(R.id.imageView15);
        imageView4 = findViewById(R.id.imageView16);
        imageView5 = findViewById(R.id.imageView17);
        imageView6 = findViewById(R.id.imageView18);
        imageView7 = findViewById(R.id.imageView19);
        imageView8 = findViewById(R.id.imageView20);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,currency);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(arrayAdapter);
        spinner2.setAdapter(arrayAdapter);

        imageView1.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
        imageView3.setVisibility(View.INVISIBLE);
        imageView4.setVisibility(View.INVISIBLE);
        imageView5.setVisibility(View.INVISIBLE);
        imageView6.setVisibility(View.INVISIBLE);
        imageView7.setVisibility(View.INVISIBLE);
        imageView8.setVisibility(View.INVISIBLE);


        btnsifir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSonuc.getText().toString().startsWith("0")){
                    txtSonuc.setText("0");
                }
                else{
                    if(txtSonuc.getText().toString().endsWith("0.")){
                        txtSonuc.setText(txtSonuc.getText().toString() +btnsifir.getText().toString());
                    }
                    else{
                        txtSonuc.setText("0");
                    }
                }


            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSonuc.getText().toString().endsWith("0")) {
                    txtSonuc.setText(txtSonuc.getText().toString().substring(1,txtSonuc.getText().length()));
                    if (txtSonuc.getText().toString().endsWith("0.")) {
                        txtSonuc.setText(txtSonuc.getText().toString() + btn1.getText().toString());
                    } else {
                        txtSonuc.setText(txtSonuc.getText().toString() + btn1.getText().toString());
                    }
                }

                else {
                    txtSonuc.setText(txtSonuc.getText().toString() + btn1.getText().toString());
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSonuc.getText().toString().endsWith("0")) {
                    txtSonuc.setText(txtSonuc.getText().toString().substring(1,txtSonuc.getText().length()));
                    if (txtSonuc.getText().toString().endsWith("0.")) {
                        txtSonuc.setText(txtSonuc.getText().toString() + btn2.getText().toString());
                    } else {
                        txtSonuc.setText(txtSonuc.getText().toString() + btn2.getText().toString());
                    }
                }

                else {
                    txtSonuc.setText(txtSonuc.getText().toString() + btn2.getText().toString());
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSonuc.getText().toString().endsWith("0")) {
                    txtSonuc.setText(txtSonuc.getText().toString().substring(1,txtSonuc.getText().length()));
                    if (txtSonuc.getText().toString().endsWith("0.")) {
                        txtSonuc.setText(txtSonuc.getText().toString() + btn3.getText().toString());
                    } else {
                        txtSonuc.setText(txtSonuc.getText().toString() + btn3.getText().toString());
                    }
                }

                else {
                    txtSonuc.setText(txtSonuc.getText().toString() + btn3.getText().toString());
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSonuc.getText().toString().endsWith("0")) {
                    txtSonuc.setText(txtSonuc.getText().toString().substring(1,txtSonuc.getText().length()));
                    if (txtSonuc.getText().toString().endsWith("0.")) {
                        txtSonuc.setText(txtSonuc.getText().toString() + btn4.getText().toString());
                    } else {
                        txtSonuc.setText(txtSonuc.getText().toString() + btn4.getText().toString());
                    }
                }

                else {
                    txtSonuc.setText(txtSonuc.getText().toString() + btn4.getText().toString());
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSonuc.getText().toString().endsWith("0")) {
                    txtSonuc.setText(txtSonuc.getText().toString().substring(1,txtSonuc.getText().length()));
                    if (txtSonuc.getText().toString().endsWith("0.")) {
                        txtSonuc.setText(txtSonuc.getText().toString() + btn5.getText().toString());
                    } else {
                        txtSonuc.setText(txtSonuc.getText().toString() + btn5.getText().toString());
                    }
                }

                else {
                    txtSonuc.setText(txtSonuc.getText().toString() + btn5.getText().toString());
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSonuc.getText().toString().endsWith("0")) {
                    txtSonuc.setText(txtSonuc.getText().toString().substring(1,txtSonuc.getText().length()));
                    if (txtSonuc.getText().toString().endsWith("0.")) {
                        txtSonuc.setText(txtSonuc.getText().toString() + btn6.getText().toString());
                    } else {
                        txtSonuc.setText(txtSonuc.getText().toString() + btn6.getText().toString());
                    }
                }

                else {
                    txtSonuc.setText(txtSonuc.getText().toString() + btn6.getText().toString());
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSonuc.getText().toString().endsWith("0")) {
                    txtSonuc.setText(txtSonuc.getText().toString().substring(1,txtSonuc.getText().length()));
                    if (txtSonuc.getText().toString().endsWith("0.")) {
                        txtSonuc.setText(txtSonuc.getText().toString() + btn7.getText().toString());
                    } else {
                        txtSonuc.setText(txtSonuc.getText().toString() + btn7.getText().toString());
                    }
                }

                else {
                    txtSonuc.setText(txtSonuc.getText().toString() + btn7.getText().toString());
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSonuc.getText().toString().endsWith("0")) {
                    txtSonuc.setText(txtSonuc.getText().toString().substring(1,txtSonuc.getText().length()));
                    if (txtSonuc.getText().toString().endsWith("0.")) {
                        txtSonuc.setText(txtSonuc.getText().toString() + btn8.getText().toString());
                    } else {
                        txtSonuc.setText(txtSonuc.getText().toString() + btn8.getText().toString());
                    }
                }

                else {
                    txtSonuc.setText(txtSonuc.getText().toString() + btn8.getText().toString());
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSonuc.getText().toString().endsWith("0")) {
                    txtSonuc.setText(txtSonuc.getText().toString().substring(1,txtSonuc.getText().length()));
                    if (txtSonuc.getText().toString().endsWith("0.")) {
                        txtSonuc.setText(txtSonuc.getText().toString() + btn9.getText().toString());
                    } else {
                        txtSonuc.setText(txtSonuc.getText().toString() + btn9.getText().toString());
                    }
                }

                else {
                    txtSonuc.setText(txtSonuc.getText().toString() + btn9.getText().toString());
                }
            }
        });

        btnNokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSonuc.getText().toString() == "0"){
                    txtSonuc.setText(txtSonuc.getText() + btnNokta.getText().toString());
                }

                else{
                    txtSonuc.setText(txtSonuc.getText() + btnNokta.getText().toString());
                }
            }
        });

        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSonuc.getText().equals("")){
                    txtSonuc.setText("0");
                }
                else{
                    txtSonuc.setText(txtSonuc.getText().toString().substring(0,txtSonuc.getText().length()-1));
                }
            }
        });

        btnSil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSonuc.setText("0");
                txtSonuc2.setText("0");
                imageView1.setVisibility(View.INVISIBLE);
                imageView2.setVisibility(View.INVISIBLE);
                imageView3.setVisibility(View.INVISIBLE);
                imageView4.setVisibility(View.INVISIBLE);
                imageView5.setVisibility(View.INVISIBLE);
                imageView6.setVisibility(View.INVISIBLE);
                imageView7.setVisibility(View.INVISIBLE);
                imageView8.setVisibility(View.INVISIBLE);
            }
        });


        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            Double sayi = Double.valueOf(txtSonuc.getText().toString());
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(currency[position] == "Avro"){
                    imageView1.setVisibility(View.INVISIBLE);
                    imageView3.setVisibility(View.VISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView7.setVisibility(View.INVISIBLE);

                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        Double sayi = Double.valueOf(txtSonuc.getText().toString());
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if(currency[position] == "Dolar"){
                                imageView8.setVisibility(View.INVISIBLE);
                                imageView6.setVisibility(View.INVISIBLE);
                                imageView2.setVisibility(View.VISIBLE);
                                sayi = sayi * (1.09);
                                String cevir = String.valueOf(sayi);
                                txtSonuc2.setText(cevir);
                            }

                            if(currency[position] == "Sterlin"){
                                imageView2.setVisibility(View.INVISIBLE);
                                imageView6.setVisibility(View.INVISIBLE);
                                imageView8.setVisibility(View.VISIBLE);
                                sayi = sayi * (0.89);
                                String cevir = String.valueOf(sayi);
                                txtSonuc2.setText(cevir);
                            }

                            if(currency[position] == "TL"){
                                imageView8.setVisibility(View.INVISIBLE);
                                imageView2.setVisibility(View.INVISIBLE);
                                imageView6.setVisibility(View.VISIBLE);
                                sayi = sayi * (7.42);
                                String cevir = String.valueOf(sayi);
                                txtSonuc2.setText(cevir);
                            }

                            if(txtSonuc2.getText().toString().endsWith("0")){
                                txtSonuc2.setText(txtSonuc2.getText().toString().substring(0,txtSonuc2.getText().toString().length()-3));
                            }

                            if(txtSonuc2.getText().length() >= 6){
                                txtSonuc2.setText(txtSonuc2.getText().toString().substring(0,4));
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }

                if(currency[position] == "Sterlin"){
                    imageView1.setVisibility(View.INVISIBLE);
                    imageView3.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView7.setVisibility(View.VISIBLE);
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        Double sayi = Double.valueOf(txtSonuc.getText().toString());
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if(currency[position] == "Dolar"){
                                imageView4.setVisibility(View.INVISIBLE);
                                imageView8.setVisibility(View.INVISIBLE);
                                imageView2.setVisibility(View.VISIBLE);
                                imageView6.setVisibility(View.INVISIBLE);
                                sayi = sayi * (1.23);
                                String cevir = String.valueOf(sayi);
                                txtSonuc2.setText(cevir);
                            }

                            if(currency[position] == "Avro"){
                                imageView4.setVisibility(View.VISIBLE);
                                imageView8.setVisibility(View.INVISIBLE);
                                imageView2.setVisibility(View.INVISIBLE);
                                imageView6.setVisibility(View.INVISIBLE);
                                sayi = sayi * (1.12);
                                String cevir = String.valueOf(sayi);
                                txtSonuc2.setText(cevir);
                            }

                            if(currency[position] == "TL"){
                                imageView4.setVisibility(View.INVISIBLE);
                                imageView8.setVisibility(View.INVISIBLE);
                                imageView2.setVisibility(View.INVISIBLE);
                                imageView6.setVisibility(View.VISIBLE);
                                sayi = sayi * (8.32);
                                String cevir = String.valueOf(sayi);
                                txtSonuc2.setText(cevir);
                            }

                            if(txtSonuc2.getText().toString().endsWith("0")){
                                txtSonuc2.setText(txtSonuc2.getText().toString().substring(0,txtSonuc2.getText().toString().length()-2));
                            }

                            if(txtSonuc2.getText().length() >= 6){
                                txtSonuc2.setText(txtSonuc2.getText().toString().substring(0,4));
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }

                if(currency[position] == "Dolar"){
                    imageView1.setVisibility(View.VISIBLE);
                    imageView3.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                    imageView7.setVisibility(View.INVISIBLE);

                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        Double sayi = Double.valueOf(txtSonuc.getText().toString());
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if(currency[position] == "TL"){
                                sayi = sayi * (6.78);
                                String cevir = String.valueOf(sayi);
                                txtSonuc2.setText(cevir);
                            }

                            if(currency[position] == "Sterlin"){
                                sayi = sayi * (0.81);
                                String cevir = String.valueOf(sayi);
                                txtSonuc2.setText(cevir);
                            }

                            if(currency[position] == "Avro"){
                                sayi = sayi * (0.91);
                                String cevir = String.valueOf(sayi);
                                txtSonuc2.setText(cevir);
                            }

                            if(txtSonuc2.getText().toString().endsWith("0")){
                                txtSonuc2.setText(txtSonuc2.getText().toString().substring(0,txtSonuc2.getText().toString().length()-2));
                            }

                            if(txtSonuc2.getText().length() >= 6){
                                txtSonuc2.setText(txtSonuc2.getText().toString().substring(0,4));
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }

                if(currency[position] == "TL"){
                    imageView1.setVisibility(View.INVISIBLE);
                    imageView3.setVisibility(View.INVISIBLE);
                    imageView5.setVisibility(View.VISIBLE);
                    imageView7.setVisibility(View.INVISIBLE);
                    spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        Double sayi = Double.valueOf(txtSonuc.getText().toString());
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if(currency[position] == "Dolar"){
                                sayi = sayi * (0.15);
                                String cevir = String.valueOf(sayi);
                                txtSonuc2.setText(cevir);
                            }

                            if(currency[position] == "Sterlin"){
                                sayi = sayi * (0.12);
                                String cevir = String.valueOf(sayi);
                                txtSonuc2.setText(cevir);
                            }

                            if(currency[position] == "Avro"){
                                sayi = sayi * (0.13);
                                String cevir = String.valueOf(sayi);
                                txtSonuc2.setText(cevir);
                            }

                            if(txtSonuc2.getText().toString().endsWith("0")){
                                txtSonuc2.setText(txtSonuc2.getText().toString().substring(0,txtSonuc2.getText().toString().length()-2));
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




}

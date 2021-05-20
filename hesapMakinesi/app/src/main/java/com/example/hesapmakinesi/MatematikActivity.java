package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MatematikActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnsifir,btnNokta,btnSil,btnCE,btnLogaritma,btnln,btnOnUs,btnUs
            ,btnKup,btnKare,btnfaktoriyel,btnmutlak,btnArtiEksi,btnBol;
    TextView txtSonuc;
    ImageButton btnkarekok,btnpi,btncarpi,btnarti,btnbol,btneksi,btnesit;

    double toplacikar;
    double ilkdouble;
    double ikincidouble;
    double toplamdouble;
    int toplaclick;
    int cikarclick;
    int carpclick;
    int bolclick;
    int decimalclick;
    int karekokclick;
    int kupclick;
    int kareclick;
    int logaritmaclick;
    int lnclick;
    int onUsmaclick;
    int usAlmaclick;
    double a,b,c,d,e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematik);
        txtSonuc = findViewById(R.id.Txtsonuc);

        btnsifir = findViewById(R.id.btnSifir);
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
        btn1 = findViewById(R.id.btnBir);
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
        btn2 = findViewById(R.id.BtnIki);
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
        btn3 = findViewById(R.id.btnUc);
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
        btn4 = findViewById(R.id.btnDort);
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
        btn5 = findViewById(R.id.btnBes);
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
        btn6 = findViewById(R.id.btnAlti);
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
        btn7 = findViewById(R.id.btnYedi);
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
        btn8 = findViewById(R.id.btnSekiz);
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
        btn9 = findViewById(R.id.btnDokuz);
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

        btnln = findViewById(R.id.btnln);
        btnln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ilkdouble = Double.parseDouble(txtSonuc.getText().toString());
                lnclick = 1;
                decimalclick=0;toplamdouble=0;
            }
        });

        btnNokta = findViewById(R.id.btnnokta);
        btnNokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSonuc.getText().toString() == "0"){
                    txtSonuc.setText(txtSonuc.getText() + btnNokta.getText().toString());
                }

                else{
                    txtSonuc.setText(txtSonuc.getText() + btnNokta.getText().toString());
                }
                decimalclick=1;
            }
        });

        btnarti = findViewById(R.id.btnArtı);
        btnarti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ilkdouble = Double.parseDouble(txtSonuc.getText().toString());
                txtSonuc.setText("");
                toplaclick = 1;
                decimalclick = 0;
            }
        });

        btncarpi = findViewById(R.id.btnMultiple);
        btncarpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ilkdouble = Double.parseDouble(txtSonuc.getText().toString());
                txtSonuc.setText("");
                carpclick = 1;
                decimalclick = 0;
            }
        });

        btneksi = findViewById(R.id.btnMinus);
        btneksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ilkdouble = Double.parseDouble(txtSonuc.getText().toString());
                txtSonuc.setText("");
                cikarclick = 1;
                decimalclick = 0;
            }
        });

        btnbol = findViewById(R.id.btnDivison);
        btnbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ilkdouble = Double.parseDouble(txtSonuc.getText().toString());
                txtSonuc.setText("");
                bolclick = 1;
                decimalclick = 0;
            }
        });

        btnKare = findViewById(R.id.btnKare);
        btnKare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ilkdouble = Double.parseDouble(txtSonuc.getText().toString());
                kareclick = 1;
                decimalclick=0;toplamdouble=0;
            }
        });

        btnkarekok = findViewById(R.id.btnKok);
        btnkarekok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ilkdouble = Double.parseDouble(txtSonuc.getText().toString());
                karekokclick = 1;
                decimalclick=0;toplamdouble=0;
            }
        });

        btnKup = findViewById(R.id.btnKup);
        btnKup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ilkdouble = Double.parseDouble(txtSonuc.getText().toString());
                kupclick = 1;
                decimalclick=0;toplamdouble=0;
            }
        });

        btnLogaritma = findViewById(R.id.btnLogaritma);
        btnLogaritma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ilkdouble = Double.parseDouble(txtSonuc.getText().toString());
                logaritmaclick = 1;
                decimalclick=0;toplamdouble=0;
            }
        });

        btnOnUs = findViewById(R.id.btnOnUs);
        btnOnUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ilkdouble = Double.parseDouble(txtSonuc.getText().toString());
                onUsmaclick = 1;
                decimalclick=0;toplamdouble=0;
            }
        });

        btnUs = findViewById(R.id.btnUs);
        btnUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ilkdouble = Double.parseDouble(txtSonuc.getText().toString());
                txtSonuc.setText("");
                usAlmaclick = 1;
                decimalclick=0;toplamdouble=0;
            }
        });

        btnCE = findViewById(R.id.btnce);
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

        btnSil = findViewById(R.id.btnsil);
        btnSil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSonuc.setText("0");
                a=0;b=0;ilkdouble=0;ikincidouble=0;

            }
        });

        btnfaktoriyel = findViewById(R.id.btnFaktoriyel);
        btnfaktoriyel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayi = Integer.valueOf(txtSonuc.getText().toString());
                int carp=1;
                while( sayi> 0){
                    carp = carp * sayi;
                    sayi = sayi - 1;
                }
                if(carp == 1 || carp == 0){
                    txtSonuc.setText("1");
                }

                else{
                    txtSonuc.setText(String.valueOf(carp));
                }
            }
        });

        btnmutlak = findViewById(R.id.btnMutlak);
        btnmutlak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double sayi = Double.valueOf(txtSonuc.getText().toString());
                if(sayi>= 0){
                    txtSonuc.setText(String.valueOf(sayi));
                }
                else{
                    sayi = sayi * (-1);
                    txtSonuc.setText(String.valueOf(sayi));
                }
            }
        });

        btnArtiEksi = findViewById(R.id.btnArtiEksi);
        btnArtiEksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSonuc.getText().toString().startsWith("-")){
                    txtSonuc.setText(txtSonuc.getText().toString().substring(1,txtSonuc.getText().length()));
                }

                else{
                    txtSonuc.setText("-"+ txtSonuc.getText());
                }
            }
        });

        btnBol = findViewById(R.id.btnBol);
        btnBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtSonuc.getText().toString() == "0")
                {
                    txtSonuc.setText("Sıfıra bölünemez");
                }

                else{
                    Double sayi = Double.valueOf(txtSonuc.getText().toString());
                    Double sonuc = 1 / sayi;
                    txtSonuc.setText(String.valueOf(sonuc));
                }
            }
        });

        btnpi = findViewById(R.id.btnPi);
        btnpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double pi = Math.PI;
                txtSonuc.setText(String.valueOf(pi));
            }
        });

        btnesit = findViewById(R.id.btnEsittir);
        btnesit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ikincidouble = Double.parseDouble(txtSonuc.getText().toString());
                if(toplaclick>0){
                    toplamdouble = ilkdouble + ikincidouble;
                    txtSonuc.setText(""+toplamdouble);
                    ilkdouble=0;ikincidouble=0;toplaclick=0;
                }
                if(cikarclick>0){
                    toplamdouble = ilkdouble - ikincidouble;
                    txtSonuc.setText(""+toplamdouble);
                    ilkdouble=0;ikincidouble=0;cikarclick=0;
                }
                if(carpclick>0){
                    toplamdouble = ilkdouble * ikincidouble;
                    txtSonuc.setText(""+toplamdouble);
                    ilkdouble=0;ikincidouble=0;carpclick=0;
                }
                if(bolclick>0){
                    toplamdouble = ilkdouble / ikincidouble;
                    txtSonuc.setText(""+toplamdouble);
                    ilkdouble=0;ikincidouble=0;bolclick=0;
                }
                if(karekokclick>0){
                    d = Math.sqrt(ilkdouble);
                    txtSonuc.setText(""+d);
                    ilkdouble=0;ikincidouble=0;karekokclick=0;
                }
                if (kareclick>0){
                    c = Math.pow(ilkdouble,2);
                    txtSonuc.setText(""+c);
                    ilkdouble=0;ikincidouble=0;kareclick=0;
                }
                if (kupclick>0){
                    e = Math.pow(ilkdouble,3);
                    txtSonuc.setText(""+e);
                    ilkdouble=0;ikincidouble=0;kupclick=0;
                }

                if(lnclick >0){
                    txtSonuc.setText(""+Math.log(ilkdouble));
                    ilkdouble=0;ikincidouble=0;lnclick=0;
                }

                if(logaritmaclick>0){
                    txtSonuc.setText(""+Math.log10(ilkdouble));
                    ilkdouble=0;ikincidouble=0;logaritmaclick=0;
                }

                if(onUsmaclick>0){
                    txtSonuc.setText(""+Math.pow(ilkdouble,10));
                    ilkdouble=0;ikincidouble=0;onUsmaclick=0;
                }

                if(usAlmaclick>0){
                    toplamdouble = Math.pow(ilkdouble,ikincidouble);
                    txtSonuc.setText(""+toplamdouble);
                    ilkdouble=0;ikincidouble=0;onUsmaclick=0;
                }
            }
        });

    }

    public void home(View view){
        Intent intent = new Intent(MatematikActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void length(View view){
        Intent intent = new Intent(MatematikActivity.this,UzunlukActivity.class);
        startActivity(intent);
    }




}





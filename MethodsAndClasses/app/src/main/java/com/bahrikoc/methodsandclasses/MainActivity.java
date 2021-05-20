package com.bahrikoc.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("on create called");
        testMethod();
        System.out.println(math(6,8));
        System.out.println(newMethod("Buton"));
        userName = "";
        makeMusician();
        makeSimpsons();
    }

    public void makeSimpsons(){
        Simpsons simpsons = new Simpsons("Bahri",24,"Data Scientist");
        System.out.println(simpsons.getName());
        simpsons.setAge(30);
        System.out.println(simpsons.getAge());
    }

    public void makeMusician(){
        //instance
        Musicians musicians = new Musicians("Bahri","Guitar",24);
        System.out.println(musicians.instrument);

    }

    public void testMethod(){
        userName = "Ahmet";
        int x = 4 + 4;
        x = 7;
        System.out.println("value of x:"+x);
    }

    public int math(int a,int b){
        userName = "Hasan";
        int x = 10;
        System.out.println("value of x in math:"+x);
        return a + b;
    }

    public String newMethod(String string){
        userName = "Mehmet";
        return string + " new method";
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("on resume called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("on stop called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("on pause called");
    }
}

package com.example.bage1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String age = bundle.getString("age");


        TextView textdata =findViewById(R.id.textView4);
        TextView textname =findViewById(R.id.textView5);
        TextView textage =findViewById(R.id.textView7);

        textdata.setText(name);
        textname.setText(name);
        textage.setText(age);


    }
}
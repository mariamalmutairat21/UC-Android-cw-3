package com.example.bage1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText texttitle = findViewById(R.id.editTextTextPersonName);
        EditText texttitle2 = findViewById(R.id.editTextTextPersonName2);
        EditText textname = findViewById(R.id.editTextTextPersonName);
        EditText textage = findViewById(R.id.editTextTextPersonName2);

        Button next = findViewById(R.id.button);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = texttitle.getText().toString();
                String b = texttitle2.getText().toString();
                String c = textname.getText().toString();
                String d = textage.getText().toString();

                 Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                 intent.putExtra("title", a);
                 intent.putExtra("title", b);
                 intent.putExtra("title", c);
                 intent.putExtra("title", d);
                 startActivity(intent);
                                    }

        });





    }
}
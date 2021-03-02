package com.igor.roleta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void randomizar(View view) {
        TextView texto1= findViewById(R.id.textView3);
        int n= new Random().nextInt(99);
        texto1.setText("resultado: "+n);

    }
}
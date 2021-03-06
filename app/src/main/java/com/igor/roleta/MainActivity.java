package com.igor.roleta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView IParabens = findViewById(R.id.Parabens);
        IParabens.setVisibility(View.INVISIBLE);
    }

    public void randomizar(View view) {
        ImageView IParabens = findViewById(R.id.Parabens);
        TextView texto1= findViewById(R.id.textView3);
        EditText TextNumero=findViewById(R.id.editTextTextPersonName);
        int n= new Random().nextInt(10);

        int numero=Integer.parseInt(TextNumero.getText().toString());
        if(n==numero){
            texto1.setText("");
            IParabens.setVisibility(View.VISIBLE);
        }
        else{
            texto1.setText("diferente"+n);
        }

    }

}
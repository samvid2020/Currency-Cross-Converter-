package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void yo(View view)
    {
        EditText dollarName = (EditText) findViewById(R.id.samvidamount);
        String dollars = dollarName.getText().toString();
        Double dd = Double.parseDouble(dollars);
        Double dobint = 73.53 * dd;
        String ttext = "="+ dobint.toString() + "$";
        Toast.makeText(this, ttext, Toast.LENGTH_SHORT).show();
    }
    public void voo(View view)
    {
        EditText inrName = (EditText) findViewById(R.id.codeamount);
        String inr = inrName.getText().toString();
        Double den = Double.parseDouble(inr);
        Double ddadv = den/73.53;
        String texty = "="+ ddadv.toString() + "INR";
        Toast.makeText(this, texty, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
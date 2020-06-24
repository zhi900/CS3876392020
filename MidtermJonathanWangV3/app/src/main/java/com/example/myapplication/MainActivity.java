package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputText;
    Button convertButton;
    String euro;
    TextView dollarText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = (EditText) findViewById(R.id.inputText);
        dollarText = (TextView) findViewById(R.id.dollarText);

        convertButton = (Button)    findViewById(R.id.convertButton);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                euro = inputText.getText().toString();
                double euro2 = Double.parseDouble(euro);
                double euro3 = euro2*1.13;

                dollarText.setText(String.valueOf(euro3) + " dollars");
            }
        });
    }
}
package com.example.menuproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import static java.net.Proxy.Type.HTTP;

public class MainActivity extends AppCompatActivity {
    Button smsButton;
    Button phoneButton;
    Button webButton;
    Button mapButton;
    Button shareButton;
    Button newactivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        smsButton = (Button) findViewById(R.id.smsButton);
        smsButton.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent smsIntent = new Intent(Intent.ACTION_SENDTO,
                        Uri.parse("sms:6466332212"));
                smsIntent.putExtra("sms_body", "Jonathan Wang");
                startActivity(smsIntent);
            }


        });
        phoneButton = (Button) findViewById(R.id.phoneButton);
        phoneButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:6462225416"));
                startActivity(intent);
            }




        });
        webButton = (Button) findViewById(R.id.webButton);
        webButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.google.com");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }




        });
        mapButton = (Button) findViewById(R.id.mapButton);
        mapButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:20.0118906,110.1780957?q=");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }




        });
        shareButton = (Button) findViewById(R.id.shareButton);
        shareButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setTitle("Share the Love");
            }




        });
        newactivityButton = (Button) findViewById(R.id.newactivityButton);
        newactivityButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NewActivity.class));
            }




        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.subitem1:
                startActivity(new Intent(MainActivity.this, HelpActivity.class));
            case R.id.subitem2:
                Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
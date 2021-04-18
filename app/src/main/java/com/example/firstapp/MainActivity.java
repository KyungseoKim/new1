package com.example.firstapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonCLick(View v){
        //Toast.makeText(getApplicationContext(), "파이팅 하십시오",Toast.LENGTH_LONG) .show();
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.melon.com/"));
        startActivity(i);
    }
}
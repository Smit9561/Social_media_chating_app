package com.chating_friend.social_media_chating_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    TextView txt5;
    String st1,st2;
    ImageView im1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        txt5 = findViewById(R.id.txt5);
        im1=findViewById(R.id.im1);


        st1=txt5.getText().toString();
        st2=getColoredSpanned("More","#ebac8b");


        txt5.setText(Html.fromHtml(st1+st2));

        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity6.this,MainActivity7.class));

            }
        });
    }

    private String getColoredSpanned(String text, String color) {
        String input = "<font color=" + color + ">" + text + "</font>";
        return input;
    }}
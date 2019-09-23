package com.learnable.learnable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewHtml;
    ImageView imageViewCss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewHtml = (ImageView) findViewById(R.id.imagehtml);
        imageViewCss = (ImageView) findViewById(R.id.imageCss);

        imageViewHtml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intHTML = new Intent(MainActivity.this, HTMLActivity.class);
                startActivity(intHTML);
            }
        });

        imageViewCss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intCSS = new Intent(MainActivity.this,CssActivity.class);
                startActivity(intCSS);
            }
        });


    }
}

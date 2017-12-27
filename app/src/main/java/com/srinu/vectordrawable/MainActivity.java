package com.srinu.vectordrawable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imagePragmatically;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagePragmatically = (ImageView) findViewById(R.id.imagePragmatically);
        imagePragmatically.setImageResource(R.drawable.ic_android_robot);
    }
}

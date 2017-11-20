package com.example.vineeth.medizyl12;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    ImageView iv1,iv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        b1 = (Button) findViewById(R.id.p1);
        b2 = (Button) findViewById(R.id.m1);
        iv2 = (ImageView) findViewById(R.id.imageView6);
        iv1 = (ImageView) findViewById(R.id.imageView5);
    }

    public void pre(View view)
    {
        Intent intent =new Intent(MainActivity.this,Presc.class);
        startActivity(intent);

    }

    public void map(View view)
    {
        Intent intent1 =new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent1);
    }


}

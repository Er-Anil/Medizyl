package com.example.vineeth.medizyl12;

import android.content.pm.ActivityInfo;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    WebView wv;
    Button b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        b1 = (Button) findViewById(R.id.button2);
        b2 = (Button) findViewById(R.id.button3);
        b3 = (Button) findViewById(R.id.button4);
        wv = (WebView) findViewById(R.id.webView);

        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setAllowContentAccess(true);
        wv.setWebViewClient(new WebViewClient());

        wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        wv.getSettings().setPluginState(WebSettings.PluginState.ON);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            wv.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        /*if (Build.VERSION.SDK_INT < 8) {
            wv.getSettings().setPluginsEnabled(true);
        }
        else {
            wv.getSettings().setPluginState(WebSettings.PluginState.ON);
        }*/
        wv.setWebChromeClient(new WebChromeClient());


    }
    public void hospital(View view) {
        wv.loadUrl(" http://maps.google.com/maps?q=hospital&mrt=yp&sll=lat,lon&output=kml");
        Toast.makeText(Main2Activity.this, "Showing Nearby Hospitals", Toast.LENGTH_SHORT).show();

    }

    public void medicals(View view) {

        wv.loadUrl(" http://maps.google.com/maps?q=medicals&mrt=yp&sll=lat,lon&output=kml");
        Toast.makeText(Main2Activity.this, "Showing Nearby Medicals", Toast.LENGTH_SHORT).show();
    }

    public void clinics(View view) {
        wv.loadUrl(" http://maps.google.com/maps?q=clinics&mrt=yp&sll=lat,lon&output=kml");
        Toast.makeText(Main2Activity.this, "Showing Nearby Clinics", Toast.LENGTH_SHORT).show();
    }

    }


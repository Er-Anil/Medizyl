package com.example.vineeth.medizyl12;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class Main22Activity extends AppCompatActivity {

    WebView wv;
    TextView kk;

    Presc p = new Presc();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);


        String str = p.tt5.getText().toString();


        kk = (TextView) findViewById(R.id.textView9);


        kk.setText(str+"");

        wv=(WebView) findViewById(R.id.wee);
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
        wv.loadUrl("http://https://en.wikipedia.org/wiki/"+str);
    }
}

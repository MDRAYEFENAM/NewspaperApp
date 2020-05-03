package com.mdrayefenam.newspaperapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class sixthActivity extends AppCompatActivity {

    private WebView sixthWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        sixthWebView = (WebView) findViewById(R.id.sixthWebViewId);

        WebSettings webSettings = sixthWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        sixthWebView.setWebViewClient(new WebViewClient());
        sixthWebView.loadUrl("http://web.dailyjanakantha.com/");
    }
}
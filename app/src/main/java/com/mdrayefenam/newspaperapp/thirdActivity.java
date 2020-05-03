package com.mdrayefenam.newspaperapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class thirdActivity extends AppCompatActivity {

    private WebView thirdWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        thirdWebView = (WebView) findViewById(R.id.thirdWebViewId);

        WebSettings webSettings = thirdWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        thirdWebView.setWebViewClient(new WebViewClient());
        thirdWebView.loadUrl("https://www.jugantor.com/");
    }
}
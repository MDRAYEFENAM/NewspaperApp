package com.mdrayefenam.newspaperapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class secondActivity extends AppCompatActivity {
    private WebView secondWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        secondWebView = (WebView) findViewById(R.id.secondWebViewId);

        WebSettings webSettings = secondWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        secondWebView.setWebViewClient(new WebViewClient());
        secondWebView.loadUrl("http://www.kalerkantho.com/");

    }
}
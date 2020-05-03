package com.mdrayefenam.newspaperapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class firstActivity extends AppCompatActivity {

    private WebView firstWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        firstWebView = (WebView) findViewById(R.id.firstWebViewId);

        WebSettings webSettings = firstWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        //webSettings.setLoadWithOverviewMode(true);
        //webSettings.setUseWideViewPort(true);
        firstWebView.setWebViewClient(new WebViewClient());
        firstWebView.loadUrl("https://www.prothomalo.com/");

    }
}

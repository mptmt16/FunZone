package com.mpt.android.funzone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class BubbleShooter extends AppCompatActivity {
    private WebView webView;
    private AdView mAdViewb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubble_shooter);



        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdViewb = findViewById(R.id.adViewb);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdViewb.loadAd(adRequest);

        webView = findViewById(R.id.bubbleview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://play.famobi.com/bubble-woods");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}

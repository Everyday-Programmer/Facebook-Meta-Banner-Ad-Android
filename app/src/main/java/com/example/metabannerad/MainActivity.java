package com.example.metabannerad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String placementId = "IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID"; // Replace this with your placement id

        RelativeLayout bannerAd50, bannerAd90, rectangleBanner;

        bannerAd50 = findViewById(R.id.banner_ad_50);
        bannerAd90 = findViewById(R.id.banner_ad_90);
        rectangleBanner = findViewById(R.id.banner_rectangle);

        AdView adView = new AdView(MainActivity.this, placementId, AdSize.BANNER_HEIGHT_50);
        bannerAd50.addView(adView);
        AdListener adListener = new AdListener() {
            @Override
            public void onError(Ad ad, AdError adError) {
                Toast.makeText(MainActivity.this, "Error: " + adError.getErrorMessage(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Toast.makeText(MainActivity.this, "Ad Loaded", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }
        };
        AdView.AdViewLoadConfig config = adView.buildLoadAdConfig().withAdListener(adListener).build();
        adView.loadAd(config);

        AdView adView1 = new AdView(MainActivity.this, placementId, AdSize.BANNER_HEIGHT_90);
        bannerAd90.addView(adView1);
        AdListener adListener1 = new AdListener() {
            @Override
            public void onError(Ad ad, AdError adError) {
                Toast.makeText(MainActivity.this, "Error: " + adError.getErrorMessage(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Toast.makeText(MainActivity.this, "Ad Loaded", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }
        };
        AdView.AdViewLoadConfig config1 = adView1.buildLoadAdConfig().withAdListener(adListener1).build();
        adView1.loadAd(config1);

        AdView adView2 = new AdView(MainActivity.this, placementId, AdSize.RECTANGLE_HEIGHT_250);
        rectangleBanner.addView(adView2);
        AdListener adListener2 = new AdListener() {
            @Override
            public void onError(Ad ad, AdError adError) {
                Toast.makeText(MainActivity.this, "Error: " + adError.getErrorMessage(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdLoaded(Ad ad) {
                Toast.makeText(MainActivity.this, "Ad Loaded", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }
        };
        AdView.AdViewLoadConfig config2 = adView2.buildLoadAdConfig().withAdListener(adListener2).build();
        adView2.loadAd(config2);
    }
}
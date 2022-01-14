package com.example.calcmath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchActivityPersegi(View view) {
        Log.d(LOG_TAG, "Button Persegi clicked!");

        Intent intent = new Intent(this, activityPersegi.class);
        startActivity(intent);
    }

    public void launchActivityPersegiPanjang(View view) {
        Log.d(LOG_TAG, "Button Persegi Panjang clicked!");

        Intent intent = new Intent(this, activityPersegiPanjang.class);
        startActivity(intent);
    }

    public void lauchActivityLingkaran(View view) {
        Log.d(LOG_TAG, "Button Lingkaran clicked!");

        Intent intent = new Intent(this, activityLingkaran.class);
        startActivity(intent);
    }

    public void launchActivitySegitiga(View view) {
        Log.d(LOG_TAG, "Button Segitiga clicked!");

        Intent intent = new Intent(this, activitySegitiga.class);
        startActivity(intent);
    }
}
package com.prakriti.devicenetworkconnection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView imgNetworkType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgNetworkType = findViewById(R.id.imgNetworkType);
        findViewById(R.id.btnGetNetworkStatus).setOnClickListener(v -> {
            int statusInfo = NetworkInfo.getNetworkStatus(MainActivity.this);
            switch (statusInfo) {
                case 0:
                    Toast.makeText(MainActivity.this, "Not Connected", Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    imgNetworkType.setImageResource(R.drawable.wifiinternet);
                    Toast.makeText(MainActivity.this, "WiFi Internet", Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    imgNetworkType.setImageResource(R.drawable.mobileinternet);
                    Toast.makeText(MainActivity.this, "Mobile Internet", Toast.LENGTH_SHORT).show();
                    break;
                case 3:
//                    imgNetworkType.setImageResource(R.mipmap.ic_launcher);
                    Toast.makeText(MainActivity.this, "Unknown", Toast.LENGTH_SHORT).show();
                    break;
            }
        });


    }
}
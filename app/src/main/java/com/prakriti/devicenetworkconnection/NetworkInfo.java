package com.prakriti.devicenetworkconnection;

import android.content.Context;
import android.net.ConnectivityManager;

public class NetworkInfo {

    public static int getNetworkStatus(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            // to see what type connection this device uses -> wifi / mobile, etc

        // there is already a class with the same name, so use package path to differentiate between the two
        android.net.NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if(networkInfo != null) {
            switch (networkInfo.getType()) { // getType returns int value
                case ConnectivityManager.TYPE_WIFI:
                    return 1;
                case ConnectivityManager.TYPE_MOBILE:
                    return 2;
                default: return 3;
            }
        }
        else { // device not connected to internet
            return 0;
        }
    }
}

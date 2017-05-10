package com.example.luiscobian.testfbmnotification;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by luiscobian on 4/28/17.
 */

public class MyServiceToken extends FirebaseInstanceIdService {
    private static final String LOGTAG = "android-fcm";

    @Override
    public void onTokenRefresh() {
        //Se obtiene el token actualizado
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.e(LOGTAG, "Token actualizado: " + refreshedToken);
    }
}

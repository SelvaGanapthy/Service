package com.example.admin.service;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Admin on 11/10/2017.
 */

public class Tservice extends Service {
    private static final String ACTION_IN = "android.intent.action.PHONE_STATE";
    private static final String ACTION_OUT = "android.intent.action.NEW_OUTGOING_CALL";
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public int onStartCommand(Intent intent, int flags, int startId) {
//        Log.d("StartService", "TService");
        final IntentFilter filter = new IntentFilter();
        filter.addAction(ACTION_OUT);
        filter.addAction(ACTION_IN);
        this.registerReceiver(new CallReceiver(), filter);
        return START_REDELIVER_INTENT;

    }
    @Override
    public void onDestroy() {
        Log.d("service", "destroy");
        super.onDestroy();
//        startService(new Intent(this,Tservice.class));
        Toast.makeText(getApplicationContext(),"killed",Toast.LENGTH_SHORT).show();
    }
}

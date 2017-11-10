package com.example.admin.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.widget.Toast;

import java.util.Date;

/**
 * Created by Admin on 11/10/2017.
 */

public class CallReceiver extends PhoneCallReceiver{
    @Override
    protected void onIncomingCallStarted(final Context ctx, final String number, Date start) {
        Toast.makeText(ctx, "Incoming call", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onIncomingCallEnded(final Context ctx, final String number, Date start, Date end) {
        Toast.makeText(ctx, "Call Disconnected", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onIncomingCallAnswered(Context ctx, String number, Date start, Date end) {
        Toast.makeText(ctx, "Call Answer", Toast.LENGTH_SHORT).show();
    }
}

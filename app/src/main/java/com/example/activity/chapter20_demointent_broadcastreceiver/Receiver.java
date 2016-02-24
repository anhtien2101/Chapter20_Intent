package com.example.activity.chapter20_demointent_broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Tien on 24-Feb-16.
 */
public class Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String phone = intent.getStringExtra("phone");
        Toast.makeText(context, "The phone number is : " + phone, Toast.LENGTH_SHORT).show();
    }
}

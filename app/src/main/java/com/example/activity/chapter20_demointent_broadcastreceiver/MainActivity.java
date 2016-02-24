package com.example.activity.chapter20_demointent_broadcastreceiver;

/**
 * Project demo about Intent and receiver.
 * Client input phonenumber and click button to send it to activity 2.
 * activity 2 will get it and show in textview. If click button Broadcast,
 * receiver will Toast phonenumber, which it get from activity 2.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPhone = (EditText) findViewById(R.id.edtPhone);
    }

    public void actionSend(View v){
        String phonenumber = edtPhone.getText().toString();
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("phone", phonenumber);
        startActivity(intent);
    }
}

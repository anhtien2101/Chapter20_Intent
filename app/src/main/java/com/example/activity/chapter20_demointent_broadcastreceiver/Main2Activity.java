package com.example.activity.chapter20_demointent_broadcastreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {
    TextView tvPhone;
    Button btnBroadcast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvPhone = (TextView) findViewById(R.id.tvShowPhone);
        btnBroadcast = (Button) findViewById(R.id.btnBroadcast);

        Bundle b = getIntent().getExtras();
        final String phonenumber = b.getString("phone");
        tvPhone.setText("phone number is: " + phonenumber);

        btnBroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main2Activity.this, Receiver.class);
                i.putExtra("phone", phonenumber);
                sendBroadcast(i);
            }
        });

    }
}

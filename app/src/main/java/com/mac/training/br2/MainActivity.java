package com.mac.training.br2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSend(View view) {

        Intent i = new Intent();
        i.setAction("com.mac.training.br2.MyAction");
        i.putExtra("K","Android");
        sendBroadcast(i);
    }
}

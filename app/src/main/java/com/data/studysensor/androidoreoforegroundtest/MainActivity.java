package com.data.studysensor.androidoreoforegroundtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startButton = findViewById(R.id.button1);
        Button stopButton = findViewById(R.id.button2);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(MainActivity.this, MyService.class);
                startIntent.setAction(Constants.ACTION.START_ACTION);
                startService(startIntent);
            }
        });
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stopIntent = new Intent(MainActivity.this, MyService.class);
                stopIntent.setAction(Constants.ACTION.STOP_ACTION);
                startService(stopIntent);
            }
        });
    }
}

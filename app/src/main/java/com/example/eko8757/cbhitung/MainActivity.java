package com.example.eko8757.cbhitung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button volume, konversi, exit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        volume = (Button) findViewById(R.id.btnVolume);
        konversi = (Button) findViewById(R.id.btnKonversi);
        exit = (Button) findViewById(R.id.btnExit);

        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Volume.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        });

        konversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Konversi.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

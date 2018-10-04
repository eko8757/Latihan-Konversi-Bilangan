package com.example.eko8757.cbhitung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Volume extends AppCompatActivity {

    EditText jari;
    Button hitung, kembali;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

        jari = (EditText) findViewById(R.id.editMasukan);
        hitung = (Button) findViewById(R.id.btnHasil);
        kembali = (Button) findViewById(R.id.btnKembali);
        hasil = (TextView) findViewById(R.id.txtHasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //jika tidak mengisi
                if (jari.length()==0){
                    Toast.makeText(getApplication(), "Jari-jari Tidak Boleh Kosong!",Toast.LENGTH_LONG).show();
                }
                //jika jari-jari tidak terisi
                else if (jari.length()==0){
                    Toast.makeText(getApplication(), "Panjang tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
                else {
                    String isijari = jari.getText().toString();
                    double jari = Double.parseDouble(isijari);
                    double hs = Volume(jari);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Volume.this, MainActivity.class);
                Volume.this.startActivity(intent);
                Volume.this.finish();
            }
        });
    }
    public double Volume(double r) {
        return 1.33*3.14*r*r*r;
    }
}

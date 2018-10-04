package com.example.eko8757.cbhitung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Konversi extends AppCompatActivity {

    EditText des, bin;
    Button konvert, kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi);

        des = (EditText) findViewById(R.id.editDes);
        bin = (EditText) findViewById(R.id.editBin);
        konvert = (Button) findViewById(R.id.btnConvert);
        kembali = (Button) findViewById(R.id.btnkembali);

        konvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int inputdesimal = Integer.parseInt(des.getText().toString());
                int i=0, j=0, hasil=0;
                int[]biner = new int[9];
                String hasiloktal="";
                i=9;
                while (inputdesimal > 0 ) {
                    hasil = inputdesimal %8;
                    inputdesimal = (inputdesimal - hasil)/8;
                    i--;
                    biner[i]=hasil;
                }
                for (j=0;j<=8;j++){
                    hasiloktal = hasiloktal + biner[j];
                    if ((j+1)%6==0) {
                        hasiloktal = hasiloktal+"";
                    }
                }
                bin.setText(hasiloktal);
            }
        });

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Konversi.this, MainActivity.class);
                Konversi.this.startActivity(intent);
                Konversi.this.finish();
            }
        });
    }
}

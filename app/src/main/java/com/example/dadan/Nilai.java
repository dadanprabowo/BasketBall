package com.example.dadan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Nilai extends AppCompatActivity {

    String data_a,data_b, tampil;
    Button a1,a2,b1,b2,a3,b3,reset_a,reset_b;
    TextView nama_a,nama_b,nilai_a,nilai_b;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nilai);

        data_a=getIntent().getExtras().getString("data_tim_a").toString();
        data_b=getIntent().getExtras().getString("data_tim_b").toString();
        a1=(Button) findViewById(R.id.satu_a);
        a2=(Button) findViewById(R.id.dua_a);
        a3=(Button) findViewById(R.id.tiga_a);
        b1=(Button) findViewById(R.id.satu_b);
        b2=(Button) findViewById(R.id.dua_b);
        b3=(Button) findViewById(R.id.tiga_b);
        reset_a=(Button) findViewById(R.id.reset_a);
        reset_b=(Button) findViewById(R.id.reset_b);
        nama_a=(TextView) findViewById(R.id.tim_a);
        nama_b=(TextView) findViewById(R.id.tim_b);
        nilai_a=(TextView) findViewById(R.id.nilai_a);
        nilai_b=(TextView) findViewById(R.id.nilai_b);

        nama_a.setText(data_a);
        nama_b.setText(data_b);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai_a.setText(String.valueOf(Integer.valueOf(nilai_a.getText().toString())+1));
            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai_a.setText(String.valueOf(Integer.valueOf(nilai_a.getText().toString())+2));
            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai_a.setText(String.valueOf(Integer.valueOf(nilai_a.getText().toString())+3));
            }
        });

        reset_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tampil=nilai_a.getText().toString();
                if (tampil.equals("0")){
                    Toast.makeText(getApplicationContext(),"Reset",Toast.LENGTH_SHORT).show();
                }
                else {nilai_a.setText("0");}
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai_b.setText(String.valueOf(Integer.valueOf(nilai_b.getText().toString())+1));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai_b.setText(String.valueOf(Integer.valueOf(nilai_b.getText().toString())+2));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai_b.setText(String.valueOf(Integer.valueOf(nilai_b.getText().toString())+3));
            }
        });

        reset_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampil=nilai_b.getText().toString();
                if (tampil.equals("0")){
                    Toast.makeText(getApplicationContext(),"Reset",Toast.LENGTH_SHORT).show();
                }
                else {nilai_b.setText("0");}
            }
        });

    }
}
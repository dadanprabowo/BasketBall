package com.example.dadan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText tim_a,tim_b;
    Button input;
    String TIM_A, TIM_B;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tim_a=(EditText) findViewById(R.id.text1);
        tim_b=(EditText) findViewById(R.id.text2);
        input=(Button) findViewById(R.id.btn);

        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TIM_A=tim_a.getText().toString();
                TIM_B=tim_b.getText().toString();

                if (TextUtils.isEmpty(TIM_A)){
                    tim_a.setError("Harus diisi");
                }
                else if (TIM_B.equals("")){
                    tim_b.setError("Harus diisi");
                }
                else {
                    Intent intent;
                    intent=new Intent(MainActivity.this, Nilai.class);
                    intent.putExtra("data_tim_a",tim_a.getText().toString());
                    intent.putExtra("data_tim_b",tim_b.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}
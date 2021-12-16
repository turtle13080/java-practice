package com.example.iotsmarthouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button btn_move;
    private EditText et_id;
    private String str;
    ImageView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //main xml과 main activity를 연결해라

        et_id = findViewById(R.id.et_id);

        btn_move = findViewById(R.id.btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str  = et_id.getText().toString();
                Intent intent = new Intent(MainActivity.this , MainActivity2.class);
                intent.putExtra("str", str);
                startActivity(intent);
            }
        });

        test = (ImageView)findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "hi", Toast.LENGTH_SHORT).show();
            }
        });

        }
    }

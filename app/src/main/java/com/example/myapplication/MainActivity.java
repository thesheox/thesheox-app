package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = findViewById(R.id.thesheox);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Log.i("salam", "halet chetore");
                Toast.makeText(getApplicationContext(),"halet chetore",Toast.LENGTH_SHORT)
                        .show();
            }

        });


    }
}
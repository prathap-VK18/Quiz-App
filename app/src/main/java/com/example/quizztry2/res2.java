package com.example.quizztry2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class res2 extends AppCompatActivity {
    TextView txt;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res2);
        button3=findViewById(R.id.button3);
        txt=findViewById(R.id.textView3);
        int mi2=getIntent().getIntExtra("message",0);
        txt.setText("Score : "+Integer.toString(mi2));
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(res2.this,verify.class);
                startActivity(i);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.home,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.h: {
                Intent i = new Intent(res2.this, MainActivity.class);
                startActivity(i);
                return true;
            }

            case R.id.r: {

                Intent i=new Intent(res2.this, eq12.class);
                startActivity(i);
                return true;

            }

            default: {
                return super.onOptionsItemSelected(item);
            }

        }
    }
}
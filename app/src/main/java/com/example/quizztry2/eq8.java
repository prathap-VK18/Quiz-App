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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class eq8 extends AppCompatActivity {
    int i13;
    public Button n1;
    public View view;
    TextView txt;
    public RadioButton r1,r2,r3,r4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eq14);

        txt=findViewById(R.id.textView2);
        int i12=getIntent().getIntExtra("message",0);



        n1=findViewById(R.id.n1);
        r1=findViewById(R.id.q1);
        r2=findViewById(R.id.q2);
        r3=findViewById(R.id.q3);
        r4=findViewById(R.id.q4);
        n1=findViewById(R.id.n1);
        RadioGroup r;

        r=findViewById(R.id.r);

        r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                switch (checkedId) {
                    case R.id.q1:
                        i13=0;

                        break;

                    case R.id.q2:
                        i13=0;

                        break;

                    case R.id.q3:
                        i13=0;

                        break;

                    case R.id.q4:
                        i13=1;
                        break;

                }

            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i13=i12+i13;
                Intent i=new Intent(eq8.this, eq10.class);
                i.putExtra("message",i13);
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
                Intent i = new Intent(eq8.this, MainActivity.class);
                startActivity(i);
                return true;
            }

            case R.id.r: {
                Intent i=new Intent(eq8.this, eq7.class);
                startActivity(i);
                return true;

            }

            default: {
                return super.onOptionsItemSelected(item);
            }

        }

    }
}
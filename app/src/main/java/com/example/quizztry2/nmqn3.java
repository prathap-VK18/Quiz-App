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

public class nmqn3 extends AppCompatActivity {

    private TextView txt;
    int mi2;
    public Button n1;
    public RadioButton r1,r2,r3,r4;
    public View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eq4);

        int mi1=getIntent().getIntExtra("message",0);
        mi2=mi1+mi2;


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
                        mi2=0;

                        break;

                    case R.id.q2:
                        mi2=1;


                        break;

                    case R.id.q3:
                        mi2=0;

                        break;

                    case R.id.q4:
                        mi2=0;

                        break;

                }

            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mi2=mi1+mi2;
                Intent i=new Intent(nmqn3.this, res2.class);
                i.putExtra("message",mi2);
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
                Intent i = new Intent(nmqn3.this, MainActivity.class);
                startActivity(i);
                return true;
            }

            case R.id.r: {

                Intent i = new Intent(nmqn3.this, nmqn2.class);
                startActivity(i);
                return true;

            }

            default: {
                return super.onOptionsItemSelected(item);
            }

        }
    }
}
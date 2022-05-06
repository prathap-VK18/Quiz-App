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

public class eq4 extends AppCompatActivity {
    private TextView txt;

    int i9;
public View view;
    public Button n1;
    public RadioButton r1,r2,r3,r4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eq8);




        txt=findViewById(R.id.title9);

            int i8=getIntent().getIntExtra("message",0);




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
                            i9=0;

                            break;

                        case R.id.q2:
                            i9=0;

                            break;

                        case R.id.q3:
                            i9=0;

                            break;

                        case R.id.q4:
                            i9=1;
                            break;

                    }

                }
            });
            n1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    i9=i8+i9;
                    Intent i=new Intent(eq4.this, eq5.class);
                    i.putExtra("message",i9);
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
                Intent i = new Intent(eq4.this, MainActivity.class);
                startActivity(i);
                return true;
            }

            case R.id.r: {

                Intent i=new Intent(eq4.this, eq3.class);
                startActivity(i);
                return true;

            }

            default: {
                return super.onOptionsItemSelected(item);
            }

        }
    }

}
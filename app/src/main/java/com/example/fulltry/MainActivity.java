package com.example.fulltry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    RadioGroup rg;
    RadioButton rb;
    SeekBar sb;
    CheckBox c1,c2,c3,c4;
    Button b1;
    public void tr()
    {
        int age=sb.getProgress();
        Toast.makeText(MainActivity.this, "Age="+age, Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        rg=findViewById(R.id.rg);
        c1=findViewById(R.id.cb1);
        c2=findViewById(R.id.cb2);
        c3=findViewById(R.id.cb3);
        c4=findViewById(R.id.cb4);
        sb=findViewById(R.id.sb);
        sb.setMax(100);
        b1=findViewById(R.id.b1);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            int p1=progress;
            tr();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                tr();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=et1.getText().toString();
                String add=et2.getText().toString();
                rb=findViewById(rg.getCheckedRadioButtonId());
                String sex= rb.getText().toString();
                String skill="";
                if(c1.isChecked())
                    skill=skill+"ASP";
                if(c2.isChecked())
                    skill=skill+"Android";
                if(c3.isChecked())
                    skill=skill+"Java";
                if(c4.isChecked())
                    skill=skill+"C++";
                Toast.makeText(MainActivity.this, "Name="+name+" Address="+add+" Sex="+sex +"Skill(s)"+skill, Toast.LENGTH_SHORT).show();


            }
        });

    }
}

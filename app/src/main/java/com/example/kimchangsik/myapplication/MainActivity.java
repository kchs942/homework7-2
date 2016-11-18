package com.example.kimchangsik.myapplication;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2;
    CheckBox choice1;
    RadioGroup group;
    RadioButton button1,button2,button3;
    Button result;
    ImageView image;
    LinearLayout l1;
    Image dog,cat,bunny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(TextView)findViewById(R.id.textView);
        text2=(TextView)findViewById(R.id.textView2);
        choice1=(CheckBox)findViewById(R.id.checkBox);
        group=(RadioGroup)findViewById(R.id.radioGroup1);
        button1=(RadioButton)findViewById(R.id.radioButton);
        button2=(RadioButton)findViewById(R.id.radioButton2);
        button3=(RadioButton)findViewById(R.id.radioButton3);
        result=(Button)findViewById(R.id.button);
        image=(ImageView)findViewById(R.id.imageView);
        l1=(LinearLayout)findViewById(R.id.linear);

        choice1.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    l1.setVisibility(View.VISIBLE);
                }
                else{
                    l1.setVisibility(View.INVISIBLE);
                }
            }
        });

        result.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(button1.isChecked()){
                    image.setImageResource(R.drawable.dog);
                }
                else if(button2.isChecked()){
                    image.setImageResource(R.drawable.cat);
                }
                else if(button3.isChecked()){
                    image.setImageResource(R.drawable.bunny);
                }
            }
        });

    }

    }


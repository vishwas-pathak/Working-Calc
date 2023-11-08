package com.vishwass.workingcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity{

    TextView output;
    TextView input;
    Button btndel,btnequal,btndivi,btnsub,btnmulti,btndot,btnpercent,btnplus,btnclr,one,two,three,four,five,six,seven,eight,nine,zero;

    Integer a,b,c;
    String sign="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        btnplus=findViewById(R.id.btnplus);
        btnsub=findViewById(R.id.btnsub);
        btndivi=findViewById(R.id.btndivi);
        btnmulti=findViewById(R.id.btnmulti);
        btnequal=findViewById(R.id.btnequal);
        input=findViewById(R.id.input);
        output=findViewById(R.id.output);
        btndel=findViewById(R.id.btndel);
        btnclr=findViewById(R.id.btnclr);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = input.getText().toString() + "0";
                input.setText(temp);
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = input.getText().toString() + "1";
                input.setText(temp);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = input.getText().toString() + "2";
                input.setText(temp);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = input.getText().toString() + "3";
                input.setText(temp);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = input.getText().toString() + "4";
                input.setText(temp);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = input.getText().toString() + "5";
                input.setText(temp);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = input.getText().toString() + "6";
                input.setText(temp);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = input.getText().toString() + "7";
                input.setText(temp);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = input.getText().toString() + "8";
                input.setText(temp);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = input.getText().toString() + "9";
                input.setText(temp);
            }
        });

        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = "";
                input.setText(temp);
            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!input.getText().toString().isEmpty())
                {
                    a=Integer.parseInt(input.getText().toString());
                    input.setText("");
                    sign="+";
                }
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!input.getText().toString().isEmpty())
                {
                    a=Integer.parseInt(input.getText().toString());
                    input.setText("");
                    sign="-";
                }
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!input.getText().toString().isEmpty())
                {
                    a=Integer.parseInt(input.getText().toString());
                    input.setText("");
                    sign="*";
                }
            }
        });

        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!input.getText().toString().isEmpty()) {

                    input.setText(input.getText().toString().substring(0, input.getText().length() - 1));

                }
            }});

        btndivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!input.getText().toString().isEmpty())
                {
                    a=Integer.parseInt(input.getText().toString());
                    input.setText("");
                    sign="/";
                }
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!input.getText().toString().isEmpty())
                {
                    if(sign !="")
                    {
                    b=Integer.parseInt(input.getText().toString());
                        if(sign.toString().equals("+"))
                        {
                            c=a+b;
                        } else if (sign.toString().equals("-"))
                        {
                            c=a-b;
                        } else if (sign.toString().equals("*"))
                        {
                            c=a*b;
                        } else if (sign.toString().equals("/"))
                        {
                            c=a/b;
                        }
                        input.setText(""+c);
                        a = 0;
                        b = 0;
                        sign="";

                        }

                    }

                }
        });



    }
}
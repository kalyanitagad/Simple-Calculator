package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText calArea;
    private Button btnAC;
    private Button btnper;
    private Button btnmod;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnmul;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btnminus;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btnadd;
    private Button btn0;
    private Button btnclear;
    private Button btnequal;
    private String Data;
    private String editarea;
    private TextView text;
    private int result=0;
    int val1,val2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAC =findViewById(R.id.btnAC);
        btnper =findViewById(R.id.btndivide);
        btnmod =findViewById(R.id.btnmod);
        btn7 =findViewById(R.id.btnseven);
        btn8 =findViewById(R.id.btneight);
        btn9 =findViewById(R.id.btnnine);
        btnmul =findViewById(R.id.btnmul);
        btn4 =findViewById(R.id.btnfour);
        btn5 =findViewById(R.id.btnfive);
        btn6 =findViewById(R.id.btnsix);
        btnminus =findViewById(R.id.btnminus);
        btn1 =findViewById(R.id.btnone);
        btn2 =findViewById(R.id.btntwo);
        btn3 =findViewById(R.id.btnthree);
        btnadd =findViewById(R.id.btnadd);
        btn0 =findViewById(R.id.btnzero);
        btnclear =findViewById(R.id.btnclear);
        btnequal =findViewById(R.id.btnequal);
        calArea= findViewById(R.id.edttext);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calArea.setText(calArea.getText()+"7");

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calArea.setText(calArea.getText()+"8");

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calArea.setText(calArea.getText()+"9");

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calArea.setText(calArea.getText()+"4");

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calArea.setText(calArea.getText()+"5");

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calArea.setText(calArea.getText()+"6");

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calArea.setText(calArea.getText()+"1");

            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calArea.setText(calArea.getText()+"0");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                calArea.setText(calArea.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calArea.setText(calArea.getText()+"3");

            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                val1=Integer.parseInt(calArea.getText().toString());
                calArea.setText(calArea.getText()+"*");
                //Data=text.getText().toString();
                //text.setText(Data+"*");

            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                val1=Integer.parseInt(calArea.getText().toString());
                calArea.setText(calArea.getText()+"-");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                val1=Integer.parseInt(calArea.getText().toString());
                calArea.setText(calArea.getText()+"+");
            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calArea.setText("");
                val1=0;
                val2=0;
                result=0;
            }
        });


        btnper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(calArea.getText().toString());
                calArea.setText(calArea.getText()+"/");

            }
        });

        btnmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(calArea.getText().toString());
                calArea.setText(calArea.getText()+"%");
            }
        });
       btnequal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               editarea =calArea.getText().toString();
               for(int i=0;i<=editarea.length()-1;i++)
               {
                   String secondhalf="";
                   switch (editarea.charAt(i))
                   {
                       case'+':
                           secondhalf=editarea.substring(i+1);
                           val2=Integer.parseInt(secondhalf);
                           result=val1+val2;
                           calArea.setText(String.valueOf(result));
                           break;

                       case'-':
                           secondhalf=editarea.substring(i+1);
                           val2=Integer.parseInt(secondhalf);
                           result=val1-val2;
                           calArea.setText(String.valueOf(result));
                           break;

                       case'*':
                           secondhalf=editarea.substring(i+1);
                           val2=Integer.parseInt(secondhalf);
                           result=val1*val2;
                           calArea.setText(String.valueOf(result));
                           break;

                       case'/':
                           secondhalf=editarea.substring(i+1);
                           val2=Integer.parseInt(secondhalf);
                           result=val1/val2;
                           calArea.setText(String.valueOf(result));
                           break;


                   }
               }
           }
       });

    }
}
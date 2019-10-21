package com.jtlab.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button con;
    private EditText et;

    private RadioGroup radioGroup;
    private RadioButton radioButton1, radioButton2,radioButton3;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        con= findViewById(R.id.Button);
        et = findViewById(R.id.edittext);

        radioButton1 = findViewById(R.id.radioButtonC);
        radioButton2 = findViewById(R.id.radioButtonF);
        radioButton3 = findViewById(R.id.radioButtonK);
        textView = findViewById(R.id.result);
        textView.setText(null);




        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String get = et.getText().toString();
                if(!TextUtils.isEmpty(get)){
                    if(radioButton1.isChecked()){

                        String result = String.valueOf(Double.valueOf(get)*(1.8)+32);
                        //Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                        //intent.putExtra("Result",result);
                        //startActivity(intent);
                        textView.setText("The Fahrenheit is  "+result+"°F");

                    }else if(radioButton2.isChecked()){
                        String result = String.valueOf(Double.valueOf(get)*(0.555)-(32)*(0.555));
                        //Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                        //intent.putExtra("Result",result);
                        //startActivity(intent);
                        textView.setText("The Celsius is  "+result+"°C");

                    }
                    else if(radioButton3.isChecked()){
                        String result = String.valueOf(Double.valueOf(get)*(0.555)-(32)*(0.555)+273.15);
                        //Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                        //intent.putExtra("Result",result);
                        //startActivity(intent);
                        textView.setText("The Kelvin is  "+result+"K");
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Please choose an option", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this, "Please enter value ", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}

package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button bt1;
    private EditText year;
    private EditText month;
    private EditText day;
    private EditText hr;
    private EditText min;
    private EditText sec;
    private TextView mix1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            bt1 = findViewById(R.id.button6);
            year = findViewById(R.id.editText2);
            month = findViewById(R.id.editText3);
            day = findViewById(R.id.editText4);
            hr = findViewById(R.id.editText5);
            min = findViewById(R.id.editText7);
            sec = findViewById(R.id.editText8);
            mix1 = findViewById(R.id.textView15);

            bt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int year1 = Integer.parseInt(year.getText().toString());
                    int month1 = Integer.parseInt(month.getText().toString());
                    int day1 = Integer.parseInt(day.getText().toString());
                    int hr1 = Integer.parseInt(hr.getText().toString());
                    int min1 = Integer.parseInt(min.getText().toString());
                    int sec1 = Integer.parseInt(sec.getText().toString());


                    mix1.setText(String.valueOf(year1) +"/"+String.valueOf(month1)+"/"+String.valueOf(day1)+"  "+String.valueOf(hr1)+":"+String.valueOf(min1)+":"+String.valueOf(sec1));

                }
            });
    }
}

package com.example.alton.eselab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t;
    EditText e;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.textView);
        e = (EditText) findViewById(R.id.editText);
        b=(Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp_text = e.getText().toString();
                double temp = Double.parseDouble(temp_text);
                double celsius_temp = temp - 32;
                celsius_temp = celsius_temp * 5;
                celsius_temp = celsius_temp / 9;
                t.setText(celsius_temp + "");
            }
        });
    }
}

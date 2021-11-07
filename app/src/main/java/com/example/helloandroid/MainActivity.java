package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.editTextTextPersonName);
        Button button =findViewById(R.id.button_pressme);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputname = String.valueOf(editText.getText().toString());
                editText.setText("Привет " + inputname);

            }
        });

    }
}
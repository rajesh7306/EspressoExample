package com.example.expressoexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {


    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText =  (EditText) findViewById(R.id.et_inputField);
    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_changeText:
                editText.setText("Lalala");
                break;
            case R.id.btn_switchActivity:
                Intent intent = new Intent(this, SecondActivity.class);
                intent.putExtra("input",1);
                startActivity(intent);
                break;
        }

    }
}
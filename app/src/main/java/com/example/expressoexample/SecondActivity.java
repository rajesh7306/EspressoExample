package com.example.expressoexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {

   @Override
   protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_second);
      TextView viewById=findViewById(R.id.tv_second_activity);
      Bundle b = getIntent().getExtras();
      String input=b.getString("input");
      viewById.setText(input+"");

   }

}

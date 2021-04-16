package com.example.basketplace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabItem;


public class Browse extends AppCompatActivity {

    public TabItem TabSettings;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

       // TabSettings = (TabItem)findViewById(R.id.TabSettings);

       // TabSettings.setOnClickListener(new View.OnClickListener(){
          //  @Override
           // public void onClick(View V){
             //   Intent intent = new Intent(Browse.this,Settings.class);
             //   startActivity(intent);
           // }
      //  });
    }
}
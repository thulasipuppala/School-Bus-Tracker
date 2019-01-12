package com.passionproject.thulasipuppala.schoolbusproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void driver_Click(View view){
        Intent intent = new Intent(MainActivity.this, DriverActivity1.class);
        startActivity(intent);
    }

    public void parent_Click(View view){
        Intent intent = new Intent(MainActivity.this, ParentActivity.class);
        startActivity(intent);
    }
}

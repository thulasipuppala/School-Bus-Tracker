package com.passionproject.thulasipuppala.schoolbusproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DriverActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver1);
    }
    public void start_Ride(View view) {
        Intent intent = new Intent(DriverActivity1.this, MapsActivity.class);
        startActivity(intent);
    }


}

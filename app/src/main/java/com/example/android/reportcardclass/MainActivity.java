package com.example.android.reportcardclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard grades = new ReportCard("Arturo", "A", "B", "C", "D");

        Log.v("MainActivity.java", "Report Card " + grades);
    }
}

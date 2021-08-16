package com.cfox.workmanagerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;

import android.os.Bundle;
import android.view.View;

import com.cfox.workmanagerdemo.worker.SimpleWorker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void runSimpleWorker(View view) {
        WorkRequest workRequest = new OneTimeWorkRequest.Builder(SimpleWorker.class).build();
        WorkManager.getInstance(this).enqueue(workRequest);
    }
}
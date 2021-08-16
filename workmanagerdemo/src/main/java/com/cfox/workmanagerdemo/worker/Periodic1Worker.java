package com.cfox.workmanagerdemo.worker;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import com.cfox.workmanagerdemo.EsLog;

public class Periodic1Worker extends Worker {
    public Periodic1Worker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {

        EsLog.d("doWork: run work method start ===>" );

        for (int i = 0; i < 3; i ++) {
            EsLog.d("doWork: running index : " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        EsLog.d("doWork: run work method end ===>");

        return Result.success();
    }
}

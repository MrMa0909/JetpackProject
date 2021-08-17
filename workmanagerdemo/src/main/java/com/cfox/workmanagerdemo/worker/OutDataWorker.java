package com.cfox.workmanagerdemo.worker;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.Data;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import com.cfox.workmanagerdemo.EsLog;

/**
 * 简单的worker
 *
 * 如果执行中被中断一段时间后会恢复重新执行doWorker 方法
 */
public class OutDataWorker extends Worker {

    public OutDataWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {

        String name = getInputData().getString("name");

        EsLog.d("doWork: run work method start ===> get data:" + name);

        for (int i = 0; i < 100; i ++) {
            EsLog.d("doWork: running index : " + i  + "  name:" + name);
            try {
                Thread.sleep(100);
                Data data = new Data.Builder().putString("progress", "progress value :" + i).build();
                setProgressAsync(data);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        EsLog.d("doWork: run work method end ===>");

        Data result = new Data.Builder().putString("result", "call back data").build();
        return Result.success(result);
    }
}


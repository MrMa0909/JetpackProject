package com.cfox.workmanagerdemo.worker;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import com.cfox.workmanagerdemo.EsLog;

/**
 * 简单的worker
 *
 * 如果执行中被中断一段时间后会恢复重新执行doWorker 方法
 */
public class TagWorker extends Worker {

    public TagWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        EsLog.d("doWork: run work method start ===>");

        for (int i = 0; i < 100; i ++) {
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


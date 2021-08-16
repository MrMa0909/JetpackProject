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
public class RetryWorker extends Worker {

    private int count = 0;
    public RetryWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        count ++;
        EsLog.d("doWork: run work method start ===>");
        boolean isRetry = count % 10 == 0;

        for (int i = 0; i < 10; i ++) {
            EsLog.d("doWork: running index : " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        EsLog.d("doWork: run work method end ===>" + count);

        return isRetry ? Result.success() : Result.retry();
    }
}


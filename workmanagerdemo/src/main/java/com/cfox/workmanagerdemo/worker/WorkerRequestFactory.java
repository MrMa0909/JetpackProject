package com.cfox.workmanagerdemo.worker;

import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkRequest;

public class WorkerRequestFactory {

    public static WorkRequest createSimpleWorkRequest(Class<? extends ListenableWorker> workerClass) {
        return new OneTimeWorkRequest.Builder(workerClass).build();
    }


}

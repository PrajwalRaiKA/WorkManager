package com.example.workmanager

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.work.Worker
import androidx.work.WorkerParameters


class SampleWorker(var appContext: Context, workerParams: WorkerParameters) :
    Worker(appContext, workerParams) {

    override fun doWork(): Result {
        Log.d("Workmanager:", "doWork called")

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed(Runnable {
            // Run your task here
            Toast.makeText(appContext, "Workmanager called", Toast.LENGTH_LONG).show()
//            Toast.makeText(appContext, "Testing", Toast.LENGTH_SHORT).show()
        }, 1000)
        // Indicate whether the task finished successfully with the Result
        return Result.success()

    }
}
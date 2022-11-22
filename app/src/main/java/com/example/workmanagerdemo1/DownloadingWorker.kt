package com.example.workmanagerdemo1

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.text.SimpleDateFormat
import java.util.*

class DownloadingWorker(context: Context, params: WorkerParameters) : Worker(context, params) {

    override fun doWork(): Result {
        try {
            for (i in 0..3000) {
                Log.i("MyTag", "Downloading $i")
            }

            val time = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
            val currentDate = time.format(Date())
            Log.i("MyTag", "Completed $currentDate")
            Toast.makeText(applicationContext, "Completed $currentDate", Toast.LENGTH_LONG).show()

            return Result.success()
        } catch (e:Exception){
            return Result.failure()
        }
    }
}
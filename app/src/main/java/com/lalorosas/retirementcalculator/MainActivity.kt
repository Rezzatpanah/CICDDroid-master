package com.lalorosas.retirementcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCenter.start(application, "8dd142f7-f4f0-4689-9d58-93f4e1bdea61", Analytics::class.java, Crashes::class.java);

        calculateButton.setOnClickListener {
            //throw  Exception("something wrong")
            Crashes.generateTestCrash()
        }

    }
}

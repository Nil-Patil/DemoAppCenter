package com.demoappcenter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        AppCenter.start(
            application, "9d1a16fe-7730-46bc-8f0c-42cbe5fe2964",
            Analytics::class.java, Crashes::class.java
        )
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}
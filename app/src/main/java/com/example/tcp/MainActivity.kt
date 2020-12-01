package com.example.tcp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.net.ServerSocket
import java.net.Socket
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Thread(Runnable {
            //some method
            val client = Socket("192.168.1.7", 9999)
            client.outputStream.write("Connection sucessfull".toByteArray())
            client.close()
            Log.d("hi", "hellllo")
        }).start()
    }


}
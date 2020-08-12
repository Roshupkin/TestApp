package android.bignerdranch.testapp.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast
import kotlin.random.Random

class MyService : Service() {

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        Toast.makeText(this, "${NumberRand(100)}", Toast.LENGTH_SHORT).show()
        return super.onStartCommand(intent, flags, startId)
    }


    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onRealy Destroy Service", Toast.LENGTH_SHORT).show()
    }
    
    private fun NumberRand(num: Int): Int {
        val number = Random(10).nextInt(num)
        return number
    }
}

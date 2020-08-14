package android.bignerdranch.testapp.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast
import kotlin.random.Random

class MyService : Service() {

    override fun onBind(intent: Intent): IBinder? {
        TODO("Return the communication channel to the service.")

    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        for (n in 0..3) {
            Toast.makeText(this, "${NumberRand(100)}", Toast.LENGTH_SHORT).show()
        }
        return super.onStartCommand(intent, flags, startId)
    }


    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onRealy Destroy Service", Toast.LENGTH_SHORT).show()
    }

    private fun NumberRand(num: Int): Int {
        val number = Random.nextInt(0,num)
        return number
    }
}

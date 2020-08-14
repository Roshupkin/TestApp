package android.bignerdranch.testapp.services

import android.app.IntentService
import android.content.Intent
import android.util.Log
import android.widget.Toast
import kotlin.random.Random

class MyIntentService() : IntentService("MyIntentService") {

    override fun onHandleIntent(intent: Intent?) {
        val name = intent?.getStringExtra("name")
        val age = intent?.getIntExtra("age",0)
        Log.e("EXEPTION", age.toString())
        Log.e("EXEPTION", name)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Toast.makeText(this, "${NumberRand(100)}", Toast.LENGTH_SHORT).show()
        return super.onStartCommand(intent, flags, startId)
    }




    private fun NumberRand(num: Int): Int {
        val number = Random.nextInt(num)
        return number
    }

}
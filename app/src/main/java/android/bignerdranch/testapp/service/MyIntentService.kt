package android.bignerdranch.testapp.service

import android.app.IntentService
import android.content.Intent
import android.widget.Toast
import kotlin.random.Random

class MyIntentService() : IntentService("MyIntentService") {

    override fun onHandleIntent(p0: Intent?) {
        Toast.makeText(this, "${NumberRand(100)}", Toast.LENGTH_SHORT).show()

    }


    private fun NumberRand(num: Int): Int {
        val number = Random(1).nextInt(num)
        return number
    }

}
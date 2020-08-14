package android.bignerdranch.testapp.services

import android.app.IntentService
import android.content.Intent
import android.widget.Toast
import kotlin.random.Random

class MyIntentService() : IntentService("MyIntentService") {

    /**объединение данных и отправка BoadcastReview**/
    override fun onHandleIntent(intent: Intent?) {
        val intentSecondActiv = Intent("android.bignerdranch.testapp.services.INTENT.FULLNAME")
        val name = intent?.getStringExtra("name")
        val age = intent?.getIntExtra("age", 0)

        val fullname = "$name $age"
        intentSecondActiv.putExtra("fullname", fullname)
        intentSecondActiv.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
        sendBroadcast(intentSecondActiv)


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
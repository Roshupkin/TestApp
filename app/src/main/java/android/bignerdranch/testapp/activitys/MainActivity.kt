package android.bignerdranch.testapp.activitys

import android.bignerdranch.testapp.R
import android.bignerdranch.testapp.broadcastreceivers.TimeBroacastReceiver
import android.bignerdranch.testapp.services.MyService
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController


/** хост активити **/
class MainActivity : AppCompatActivity() {
    private val mTimeBroadCastReceiver =
        TimeBroacastReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /** передача данных между активити**/
        /*
        val intent: Intent = Intent(this , SecondActivity::class.java)
        val old = 29
        var name = "Максим"
        var secondName = "Рощупкин"
        intent.putExtra("Im", old )
        startActivity(intent)*/
        /** Intent service class MyIntentService**/
        /* val intnentMyIntentService = Intent(this, MyIntentService::class.java)
         startService(intnentMyIntentService)*/

      /*  val intentMyService = Intent(this, MyService::class.java)
        startService(intentMyService)
        Toast.makeText(this, "start service", Toast.LENGTH_SHORT).show()
        Handler().postDelayed({
            Toast.makeText(this, "stop service", Toast.LENGTH_SHORT).show()
            stopService(intentMyService)},5000)
*/

    }

    /**метод объявляющй граф нафигации **/
    override fun onSupportNavigateUp() = findNavController(R.id.navgraph_host).navigateUp()
}

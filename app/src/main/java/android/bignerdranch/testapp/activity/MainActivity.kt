package android.bignerdranch.testapp.activity

import android.bignerdranch.testapp.R
import android.bignerdranch.testapp.broadcastreceiver.TimeBroacastReceiver
import android.os.Bundle
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


    }
    /**метод объявляющй граф нафигации **/
    override fun onSupportNavigateUp() = findNavController(R.id.navgraph_host).navigateUp()
}

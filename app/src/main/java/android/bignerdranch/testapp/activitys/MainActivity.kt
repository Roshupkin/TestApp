package android.bignerdranch.testapp.activitys

import android.bignerdranch.testapp.R
import android.bignerdranch.testapp.broadcastreceivers.TimeBroacastReceiver
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController


/** хост активити **/
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** передача данных между активити**/
       /* val intent = Intent(this, SecondActivity::class.java)
        val old = 29
        val name = "Максим"
        val secondName = "Рощупкин"
        intent.putExtra("Im", old).putExtra("name", name).putExtra("secondName", secondName)
        startActivity(intent)*/

    }

    /**метод объявляющй граф нафигации **/
    override fun onSupportNavigateUp() = findNavController(R.id.navgraph_host).navigateUp()
}

package android.bignerdranch.testapp.activity

import android.bignerdranch.testapp.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// передача данных между активити
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        /** приём данных из другой активити **/
        /*val data = intent.extras
        if (data != null) {

            text_view_in_second.text = data.getInt("Im").toString()
        }*/

    }
}
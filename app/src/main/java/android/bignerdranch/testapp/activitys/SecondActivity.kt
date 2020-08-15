package android.bignerdranch.testapp.activitys

import android.bignerdranch.testapp.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.second_activity.*

// передача данных между активити
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        /** приём данных из другой активити **/
        val data = intent.extras
        text_name.text = data?.getString("name1") ?: ""
        text_secondname.text = data?.getString("secondname1") ?: ""
        text_age.text = data?.getString("age1") ?: ""


        button_back.setOnClickListener {
            
        }

    }
}
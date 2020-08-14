package android.bignerdranch.testapp.fragments

import android.bignerdranch.testapp.R
import android.bignerdranch.testapp.services.MyIntentService
import android.bignerdranch.testapp.services.MyService
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_broadcast.button_back
import kotlinx.android.synthetic.main.fragment_service.*

class ServiceFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_service, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val intentMyService = Intent(context, MyService::class.java)
        val intentMyIntService = Intent(context, MyIntentService::class.java)

        button_start_myservice.setOnClickListener {
            activity?.startService(intentMyService)
            Toast.makeText(context, "start service", Toast.LENGTH_SHORT).show()
        }

        button_stop_myservice.setOnClickListener {
            activity?.stopService(intentMyService)
            Toast.makeText(context, "stop service", Toast.LENGTH_SHORT).show()
        }
        /**передача данных MyIntentService**/
        button_start_myintentservice.setOnClickListener {
            intentMyIntService.putExtra("name", "Максим").putExtra("age", 23)
            activity?.startService(intentMyIntService)
        }

        button_stop_myintentservice.setOnClickListener {

        }

        button_back.setOnClickListener {
            activity?.onBackPressed()
        }
    }


}
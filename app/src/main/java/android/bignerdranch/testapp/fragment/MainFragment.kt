package android.bignerdranch.testapp.fragment

import android.bignerdranch.testapp.activity.MainActivity
import android.bignerdranch.testapp.R
import android.bignerdranch.testapp.broadcastreceiver.TimeBroacastReceiver
import android.bignerdranch.testapp.service.MyService
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.*


/**стартовый фрагмент**/
class MainFragment : Fragment() {
    private val mTimeBroadCastReceiver =
        TimeBroacastReceiver()
    private var mMainActivity =
        MainActivity()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       /* button_di_hi.setOnClickListener {
            *//**передача контролеру фрагмента по нажатию кнопки **//*
            findNavController().navigate(R.id.fragmentDialog)
        }
        send_broadcast.setOnClickListener {
            setBrodcastSend()
        }
        on_broadcastfilter.setOnClickListener {
            registerBroadcastReceiver(view)
            Toast.makeText(context, "click", Toast.LENGTH_SHORT).show()
        }
        off_broadcastfilter.setOnClickListener {
            unregisterBroadcastReceiver(view)
        }*/
    }

    fun setBrodcastSend() {
        val intentBroadcast = Intent("android.bignerdranch.testapp.action.NAME")
        intentBroadcast.putExtra("name", "Maksim")
        intentBroadcast.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
        activity?.sendBroadcast(intentBroadcast)
        Toast.makeText(context, "Send", Toast.LENGTH_SHORT).show()
    }

    fun registerBroadcastReceiver(view: View?) {
        activity?.registerReceiver(
            mTimeBroadCastReceiver, IntentFilter(
                "android.bignerdranch.testapp.action.NAME"
            )
        )
        Toast.makeText(context, "Приёмник включен", Toast.LENGTH_SHORT).show()
    }

    // Отменяем регистрацию
    fun unregisterBroadcastReceiver(view: View?) {
        activity?.unregisterReceiver(mTimeBroadCastReceiver)
        Toast.makeText(context, "Приёмник выключён", Toast.LENGTH_SHORT)
            .show()
    }

    /**Service class MyService**/
    fun incMyIntentServiec() {
        val intentMyService = Intent(context, MyService::class.java)
        activity?.startService(intentMyService)

        Toast.makeText(context, "start service", Toast.LENGTH_SHORT).show()
        android.os.Handler().postDelayed({
            activity?.stopService(intentMyService)
            Toast.makeText(context, "stop service", Toast.LENGTH_SHORT).show()
        }, 5000)
    }
}
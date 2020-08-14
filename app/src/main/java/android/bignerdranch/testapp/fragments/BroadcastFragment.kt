package android.bignerdranch.testapp.fragments

import android.bignerdranch.testapp.R
import android.bignerdranch.testapp.broadcastreceivers.FullNameBroadcastReceiver
import android.bignerdranch.testapp.broadcastreceivers.TimeBroacastReceiver
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_broadcast.*

class BroadcastFragment : Fragment() {
    private val mTimeBroadCastReceiver = TimeBroacastReceiver()
    private val mFullNameBroadcastReceiver = FullNameBroadcastReceiver()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_broadcast, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_sendbroadcast.setOnClickListener {
            setBrodcastSend()
        }
        button_registerreciver.setOnClickListener {
            registerBroadcastReceiver()
        }
        button_unregisterreciver.setOnClickListener {
            unregisterBroadcastReceiver()
        }
        button_back.setOnClickListener {
            activity?.onBackPressed()
        }

    }


    fun setBrodcastSend() {
        val intentBroadcast = Intent("android.bignerdranch.testapp.action.NAME")
        intentBroadcast.putExtra("name", "Maksim")
        intentBroadcast.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
        activity?.sendBroadcast(intentBroadcast)
        Toast.makeText(context, "Send", Toast.LENGTH_SHORT).show()
    }

    fun registerBroadcastReceiver() {
        activity?.registerReceiver(
            mTimeBroadCastReceiver, IntentFilter(
                "android.bignerdranch.testapp.action.NAME"
            )
        )
        activity?.registerReceiver(
            mFullNameBroadcastReceiver,
            IntentFilter("android.bignerdranch.testapp.services.INTENT.FULLNAME")
        )

        Toast.makeText(context, "Приёмник включен", Toast.LENGTH_SHORT).show()
    }

    // Отменяем регистрацию
    fun unregisterBroadcastReceiver() {
        activity?.unregisterReceiver(mTimeBroadCastReceiver)
        Toast.makeText(context, "Приёмник выключён", Toast.LENGTH_SHORT)
            .show()
    }
}
package android.bignerdranch.testapp.broadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class FullNameBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val fullname = intent.getStringExtra("fullname")
        Toast.makeText(context, fullname, Toast.LENGTH_SHORT).show()
    }
}

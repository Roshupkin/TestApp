package android.bignerdranch.testapp.fragments

import android.bignerdranch.testapp.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.*


/**стартовый фрагмент**/
class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_fragmen_dilog.setOnClickListener {
            /**передача контролеру фрагмента по нажатию кнопки **/
            findNavController().navigate(R.id.fragmentDialog)
        }
        button_service.setOnClickListener {
            findNavController().navigate(R.id.serviceFragment)
        }
        button_broadast.setOnClickListener {
            findNavController().navigate(R.id.broadcastFragment)

        }
        button_secondactivity.setOnClickListener {
            findNavController().navigate(R.id.secondActivity)
        }

    }
}
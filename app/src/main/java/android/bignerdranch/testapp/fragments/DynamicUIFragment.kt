package android.bignerdranch.testapp.fragments

import android.bignerdranch.testapp.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.dynamic_ui_fragment.*
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_main.button_constrain_animation


class DynamicUIFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dynamic_ui_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_constrain_animation.setOnClickListener {
            findNavController().navigate(R.id.consrainAnimationFragment)
        }
        button_ui_draw.setOnClickListener {
           findNavController().navigate(R.id.drawFragment)
        }

    }

}
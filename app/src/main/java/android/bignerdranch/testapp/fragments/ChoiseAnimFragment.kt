package android.bignerdranch.testapp.fragments

import android.bignerdranch.testapp.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.animationschose_frament.*

class ChoiseAnimFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.animationschose_frament, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_back.setOnClickListener {
            activity?.onBackPressed()
        }
        button_constraint_anim.setOnClickListener {
            findNavController().navigate(R.id.consrainAnimationFragment)

        }
        button_simple_anim.setOnClickListener {
            findNavController().navigate(R.id.simpleAnimFragment)

        }
        button_motion_anim.setOnClickListener {
            findNavController().navigate(R.id.motionAnimFragment)

        }
    }


}
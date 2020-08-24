package android.bignerdranch.testapp.fragments

import android.bignerdranch.testapp.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnticipateOvershootInterpolator
import androidx.constraintlayout.widget.ConstraintSet
import androidx.fragment.app.Fragment
import androidx.transition.*
import kotlinx.android.synthetic.main.constrainanim_fragment1.*

class ConsrainAnimationFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.constrainanim_fragment1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener {
            animateFragemnt1ToFragment2()
        }

    }

    fun animateFragemnt1ToFragment2() {
        val transition = ChangeBounds()
        val constraintSet = ConstraintSet()

        transition.interpolator = AnticipateOvershootInterpolator(2.1f)
        transition.duration = 5000

        constraintSet.load(context, R.layout.constrainanim_fragment2)
        TransitionManager.beginDelayedTransition(
            (view as ViewGroup).findViewById(R.id.constrainLayout), transition
        )
        constraintSet.applyTo((view as ViewGroup).findViewById(R.id.constrainLayout))

    }

}
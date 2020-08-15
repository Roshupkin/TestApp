package android.bignerdranch.testapp.fragments

import android.app.Activity
import android.bignerdranch.testapp.R
import android.bignerdranch.testapp.activitys.SecondActivity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.dilog_fragment_hi.*

/**фрагмент диалога**/
class DialogFragmen : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /**надувание фрагмента**/
        return inflater.inflate(R.layout.dilog_fragment_hi, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Передача данных в SecondActvity
        button_send_name.setOnClickListener {
            /*   if (edit_age.text.isNotEmpty() or edit_name.text.isNotEmpty() or edit_secondname.text.isNotEmpty())*/
            val intentSecondActivity = Intent(context, SecondActivity::class.java)
            //считывание с edit text и отправка в SecondActivity
            val name = edit_name.text.toString()
            val secondname = edit_secondname.text.toString()
            val age = edit_age.text.toString()
            intentSecondActivity.putExtra("name1", name).putExtra("secondname1", secondname)
                .putExtra("age1", age)
            activity?.startActivity(intentSecondActivity)
        }
        edit_name.onFocusChangeListener = View.OnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                hideKeyboardFrom(view.context, view)
            }
        }
        edit_age.onFocusChangeListener = View.OnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                hideKeyboardFrom(view.context, view)
            }
        }
        edit_secondname.onFocusChangeListener = View.OnFocusChangeListener { view, hasFocus ->
            if (!hasFocus) {
                hideKeyboardFrom(view.context, view)
            }
        }
    }

    //скрытие мягкой клавиатуры при нажатии на любую область фрагмента
    private fun hideKeyboardFrom(context: Context, view: View) {
        val imm = context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
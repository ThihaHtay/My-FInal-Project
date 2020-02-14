package com.example.mydiet


import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.navigation.findNavController
import com.example.mydiet.viewmodel.ResultViewModel
import kotlinx.android.synthetic.main.fragment_calculate.*

/**
 * A simple [Fragment] subclass.
 */
class CalculateFragment : Fragment() {

    private lateinit var feet: EditText
    private lateinit var inches: EditText
    private lateinit var weight: EditText

   // private lateinit var result: TextView
  //  private lateinit var bmiresult: TextView
    private lateinit var radioGroup: RadioGroup
    private lateinit var age: EditText

    private lateinit var calculate: Button
    lateinit var resultViewModel: ResultViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_calculate, container, false)

        feet = root.findViewById(R.id.edit_ft)
        inches = root.findViewById(R.id.edit_inches)
        weight = root.findViewById(R.id.edit_weight)
        calculate = root.findViewById(R.id.btncalculate)
        radioGroup = root.findViewById(R.id.radioGroup)
        age = root.findViewById(R.id.edit_age)
        calculate = root.findViewById(R.id.btncalculate)


        calculate.setOnClickListener {
            root.findNavController().navigate(R.id.action_calculateFragment2_to_resultFragment)
            //calculateBMIFunction()
            //calculateBMR()
          var feet = edit_ft.text.toString().toFloat()



        }
        return root

    }

}
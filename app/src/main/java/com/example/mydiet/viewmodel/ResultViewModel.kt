package com.example.mydiet.viewmodel

import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mydiet.R
import com.example.mydiet.model.AllResult

class ResultViewModel : ViewModel() {

    private var selectedResult: MutableLiveData<AllResult> = MutableLiveData()
    fun getselectedResult(): LiveData<AllResult> = selectedResult

    fun selectedResult(result: AllResult) {
        selectedResult.value = result

    }
}

fun calculateBMIFunction(){
    val strFeet = result.feet.toString()
    val strInches = result.inches.toString()
    val strWeight = result.weight.toString()
    val valFeet: Float
    val valInches: Float
    val valWeight: Float



    if (TextUtils.isEmpty(strFeet)) {
        strFeet.error= "Cannot be empty"
        return
    } else {
        valFeet = strFeet.toFloat()
    }
    if (TextUtils.isEmpty(strInches)) {
        inches.error = "Cannot be empty"
        return
    } else {
        valInches = strFeet.toFloat()
    }
    if (TextUtils.isEmpty(strWeight)) {
        weight.error = "Cannot be empty"
        return
    } else {
        valWeight = strFeet.toFloat()
    }

    val inches= valFeet*12F
    val totalinches= inches+valInches
    //val bmi = valWeight / (((valFeet) * 12) + valInches) * (((valFeet) * 12) + valInches)
    val bmi=valWeight*703 / totalinches*totalinches


    displayBMIFunction(bmi)

}

fun displayBMIFunction(bmi: Float) {
    val strResult: String
    val bmiLevel: String = when {
        bmi < 16 -> "Severely UnderWeight"
        bmi < 18.25 -> "UnderWeight"
        bmi < 25 -> "Normal"
        bmi < 30 -> "OverWeight"
        else -> "Obese"
    }
    strResult = "$bmi lb/feet  \n $bmiLevel "
    bmiresult.text = strResult
}
fun calculateBMR() {
    val strFeet = feet.text.toString()
    val strInches = inches.text.toString()
    val strWeight = weight.text.toString()
    val strAge = age.text.toString()
    val valFeet: Float
    val valInches: Float
    val valWeight: Float
    val bmr: Float
    val valAge: Float
    val checkId = radioGroup.checkedRadioButtonId

    if (TextUtils.isEmpty(strFeet)) {
        feet.error = "Cannot be empty"
        return
    } else {
        valFeet = strFeet.toFloat()
    }
    if (TextUtils.isEmpty(strInches)) {
        inches.error = "Cannot be empty"
        return
    } else {
        valInches = strFeet.toFloat()
    }
    if (TextUtils.isEmpty(strWeight)) {
        weight.error = "Cannot be empty"
        return
    } else {
        valWeight = strFeet.toFloat()
    }
    if (TextUtils.isEmpty(strInches)) {
        age.error = "Cannot be empty"
        return
    } else {
        valAge = strAge.toFloat()
    }
    if (-1 != checkId) {
        var answerIndex = 0

        when (checkId) {
            R.id.male -> answerIndex = 1
            R.id.female -> answerIndex = 2

        }
        if (answerIndex == 1) {

            bmr =
                66.47F + (6.24F * valWeight) + (12.7F * (((valFeet) * 12) + valInches)) - (6.755F * valAge)
        } else {
            bmr =
                65.51F + (4.35F * valWeight) + (4.7F * (((valFeet) * 12) + valInches)) - (4.7F * valAge)
        }

        val bmrResultOne: String
        val bmrOne:Float
        bmrOne = bmr * 1.2F
        bmrResultOne ="Little or no exercise = $bmrOne"
        result.text= bmrResultOne

        val bmrResultTwo: String
        val bmrTwo: Float
        bmrTwo = bmr * 1.375F
        bmrResultTwo = "Light exercise or sports 1-3 day/week = $bmrTwo"
        result.text=bmrResultTwo

        val bmrResultThree: String
        val bmrThree: Float
        bmrThree = bmr* 1.55F
        bmrResultThree = "Moderate exercise 3-5 day/week = $bmrThree"
        result.text=bmrResultThree

        val bmrResultFour: String
        val bmrFour: Float
        bmrFour= bmr* 1.725F
        bmrResultFour ="hard exercise 6-7 day/week = $bmrFour"
        result.text= bmrResultFour

        val bmrResultFive:String
        val bmrFive= bmr * 1.9F
        bmrResultFive ="Very hard exercise and a physical job = $bmrFive"
        result.text= bmrResultFive

    }


}

}
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


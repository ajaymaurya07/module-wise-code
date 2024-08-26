package com.example.androidmodulewisecode

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {

    fun emailService(){
        Log.d("TAG", "emailService:..... ")
    }
}
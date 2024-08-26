package com.example.androidmodulewisecode

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun userRepo(){
        Log.d("TAG", "userRepo: ...")
    }
}
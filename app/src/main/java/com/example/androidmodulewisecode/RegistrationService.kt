package com.example.androidmodulewisecode

import android.util.Log
import javax.inject.Inject

class RegistrationService @Inject constructor(val emailService: EmailService,val userRepository: UserRepository) {

    fun registrationForm(){
        Log.d("TAG", "registrationForm: .....")
    }

}
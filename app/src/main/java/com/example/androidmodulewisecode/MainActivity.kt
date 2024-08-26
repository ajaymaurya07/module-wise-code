package com.example.androidmodulewisecode

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var emailService: EmailService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        val userRegistrationComponent=DaggerUserRegistrationComponent.builder().build()
//        userRegistrationComponent.inject(this)
//        emailService.emailService()
        userRegistrationComponent.getRegistrationService().registrationForm()
        userRegistrationComponent.getEmailService().emailService()

    }
}
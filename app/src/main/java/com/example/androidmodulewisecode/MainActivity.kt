package com.example.androidmodulewisecode

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var registrationService: RegistrationService

    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        val userRegistrationComponent=DaggerUserRegistrationComponent.builder().build()
        userRegistrationComponent.inject(this)
        registrationService.registrationForm()
        emailService.emailService()

//        userRegistrationComponent.getRegistrationService().registrationForm()
//        userRegistrationComponent.getEmailService().emailService()

    }
}
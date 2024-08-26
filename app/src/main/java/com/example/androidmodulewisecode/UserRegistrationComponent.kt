package com.example.androidmodulewisecode

import dagger.Component

@Component
interface UserRegistrationComponent {
//    fun getRegistrationService():RegistrationService
//    fun getEmailService():EmailService

//     using field injection

    fun inject(mainActivity: MainActivity)

}
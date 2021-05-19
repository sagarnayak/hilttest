package com.example.hiletestingrepo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    @Named("two")
    lateinit var repositoryTwo: SuperRepo

    @Inject
    lateinit var repository: SuperRepo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("testLog", "One :: the result is : ${repository.login()}")

        Log.i("testLog", "Two :: the result is : ${repositoryTwo.login()}")
    }
}
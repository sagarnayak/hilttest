package com.example.hiletestingrepo

import androidx.test.ext.junit.rules.ActivityScenarioRule
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject
import javax.inject.Named

@HiltAndroidTest
class Test {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @get:Rule
    var activityScenarioRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(
        MainActivity::class.java
    )

    @Inject
    @Named("test")
    lateinit var repository: SuperRepo

    @Before
    fun setUp() {
        hiltRule.inject()
    }

    @Test
    fun testOne() {
        Assert.assertEquals("fake", repository.login())
    }
}
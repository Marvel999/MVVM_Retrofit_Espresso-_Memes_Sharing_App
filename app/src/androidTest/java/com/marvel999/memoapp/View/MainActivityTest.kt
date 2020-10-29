package com.marvel999.memoapp.View

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import com.marvel999.memoapp.R
import kotlinx.android.synthetic.main.activity_memes_page.*
import org.junit.Assert.*
import org.junit.Test

class MainActivityTest{
    @Test
    fun imagediplay(){
        val activityanssore=ActivityScenario.launch(MainActivity::class.java);
        onView(withId(R.id.imageIcon)).check(matches(isDisplayed()))
    }

    @Test
    fun textViewDiplay(){
        val activityanssore=ActivityScenario.launch(MainActivity::class.java);
        onView(withId(R.id.appName)).check(matches(isDisplayed()))

    }

}
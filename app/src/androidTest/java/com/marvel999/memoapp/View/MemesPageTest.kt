package com.marvel999.memoapp.View

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import com.marvel999.memoapp.R
import org.junit.Assert.*
import org.junit.Test

class MemesPageTest{
    @Test
    fun nextbtn(){
        val activityanssore= ActivityScenario.launch(MemesPage::class.java);
        Espresso.onView(ViewMatchers.withId(R.id.nextbtn))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

 @Test
    fun memeImg(){
        val activityanssore= ActivityScenario.launch(MemesPage::class.java);
        Espresso.onView(ViewMatchers.withId(R.id.memsImage))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun sharebtn(){
        val activityanssore= ActivityScenario.launch(MemesPage::class.java);
        Espresso.onView(ViewMatchers.withId(R.id.sharebtn))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))

    }
}
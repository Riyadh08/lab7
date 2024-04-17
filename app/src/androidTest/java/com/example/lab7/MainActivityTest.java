package com.example.lab7;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityActivityScenarioRule= new ActivityScenarioRule<MainActivity>(MainActivity.class);

    @Test
    public void testButtonClick_1() {
        // Click the button
        Espresso.onView(ViewMatchers.withId(R.id.button)).perform(ViewActions.click());


        Espresso.onView(ViewMatchers.withId(R.id.textView))
                .check(ViewAssertions.matches(ViewMatchers.withText("1")));


    }

    @Test
    public void testa()
    {
        Espresso.onView(ViewMatchers.withId(R.id.button2)).perform(ViewActions.click());


        Espresso.onView(ViewMatchers.withId(R.id.textView2))
                .check(ViewAssertions.matches(ViewMatchers.withText("2")));
    }

    @Test
    public void testButtonClick_2() {

        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click())
                .perform(ViewActions.click());


        Espresso.onView(ViewMatchers.withId(R.id.textView))
                .check(ViewAssertions.matches(ViewMatchers.withText("2")));

//
//        Espresso.onView(ViewMatchers.withId(R.id.button2))
//                .perform(ViewActions.click())
//                .perform(ViewActions.click());
//
//
//        Espresso.onView(ViewMatchers.withId(R.id.textView2))
//                .check(ViewAssertions.matches(ViewMatchers.withText("4")));



    }



}

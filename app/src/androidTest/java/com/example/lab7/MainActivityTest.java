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

        // Check if the text view displays "Red!"
        Espresso.onView(ViewMatchers.withId(R.id.textView))
                .check(ViewAssertions.matches(ViewMatchers.withText("1")));
    }

    @Test
    public void testButtonClick_2() {
        // Click the button twice
        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click())
                .perform(ViewActions.click());

        // Check if the text view displays "Green!"
        Espresso.onView(ViewMatchers.withId(R.id.textView))
                .check(ViewAssertions.matches(ViewMatchers.withText("2")));
    }


}

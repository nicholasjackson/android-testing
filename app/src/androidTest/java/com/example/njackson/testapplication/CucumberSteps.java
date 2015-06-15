package com.example.njackson.testapplication;

import android.test.ActivityInstrumentationTestCase2;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@CucumberOptions(features = "features")
public class CucumberSteps extends ActivityInstrumentationTestCase2<MainActivity> {
    public CucumberSteps() {
        super(MainActivity.class);
    }


    @When("^I press (\\s)$")
    public void pressButton(String buttonText){
        onView(withText(buttonText)).perform(click());
    }


    @Then("^I see (\\s)$")
    public void checkTextIsDisplayed(String text){
        onView(withText(text)).check(matches(isDisplayed()));
    }
}

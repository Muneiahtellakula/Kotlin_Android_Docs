package com.example.intentsexample


import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class RegisterActivityTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(RegisterActivity::class.java)

    @Test
    fun registerActivityTest() {
        val appCompatEditText = onView(
            allOf(
                withId(R.id.editText_reg),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.LinearLayout")),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatEditText.perform(replaceText("muni"), closeSoftKeyboard())

        val appCompatEditText2 = onView(
            allOf(
                withId(R.id.editText_pass_reg),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.LinearLayout")),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatEditText2.perform(replaceText("ggg"), closeSoftKeyboard())

        val materialButton = onView(
            allOf(
                withId(R.id.button_login), withText("Save"),
                childAtPosition(
                    childAtPosition(
                        withClassName(`is`("android.widget.LinearLayout")),
                        0
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton.perform(click())

        val materialButton2 = onView(
            allOf(
                withId(R.id.button_login), withText("Login"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    4
                ),
                isDisplayed()
            )
        )
        materialButton2.perform(click())

        val materialButton3 = onView(
            allOf(
                withId(R.id.button_register), withText("Register"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    5
                ),
                isDisplayed()
            )
        )
        materialButton3.perform(click())
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
}

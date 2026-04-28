package com.example.callforfiretool

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import org.junit.Rule
import org.junit.Test

class ComposeBasicTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testingBasicCompose() {
        composeTestRule.setContent { Greeting("World!") }

        composeTestRule.onNodeWithTag("greetingText").assertIsDisplayed()
    }

}
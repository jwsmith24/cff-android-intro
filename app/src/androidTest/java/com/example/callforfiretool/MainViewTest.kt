package com.example.callforfiretool

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import com.example.callforfiretool.ui.compose.MainView
import org.junit.Rule
import org.junit.Test

class MainViewTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun shouldDisplayScaffold() {
        composeTestRule.setContent { MainView() }

        composeTestRule.onNodeWithTag("mainScaffold").assertIsDisplayed()
    }

    @Test
    fun shouldDisplayTopBar() {
        composeTestRule.setContent { MainView() }

        composeTestRule.onNodeWithTag("topBar").assertIsDisplayed()

        composeTestRule.onNodeWithText("CFF").assertIsDisplayed()

        composeTestRule.onNodeWithText("Mission queue").assertIsDisplayed()
    }


}
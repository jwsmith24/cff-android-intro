package com.example.callforfiretool

import com.example.callforfiretool.logic.MainViewModel
import junit.framework.TestCase.assertEquals
import org.junit.Test

class MainViewModelTest {

    val testMainViewModel = MainViewModel()

    @Test
    fun shouldAddTwoNumbers() {
        val result = testMainViewModel.addTwoNumbers(2, 2)
        val expectation = 4

        assertEquals(expectation, result)
    }
}
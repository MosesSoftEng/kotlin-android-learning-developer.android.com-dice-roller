package com.developer.android.dice.roller

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
//    // Annotation to let jUnit know this is a test code.
//    @Test
//    fun addition_isCorrect() {
//        /**
//         *  asserts that an expected value should equal an actual value obtained through business logic.
//         */
//        assertEquals(
//            4, // Expected value
//            2 + 2 // Actual value from code being tested
//        )
//    }

    // Annotation to let jUnit know this is a test code.
    @Test
    fun generates_number() {
        val dice = MainActivity.Dice(6)
        val rollResult = dice.roll()

        assertTrue(
            "The value of rollResult was not between 1 and 6",
            rollResult in 1..6)
    }
}
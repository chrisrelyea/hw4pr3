package com.example.flashlight

import org.junit.Test
import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun variablesInitialized(){
        var newView = ViewModels()
        assertEquals(newView.cameraManager, null)
        assertEquals(newView.getCameraId, null)
    }

    @Test
    fun testSwipeDistance(){
        var newView = ViewModels()
        assertEquals(newView.swipeDistance, 0)
    }
}
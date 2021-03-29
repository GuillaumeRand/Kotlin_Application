package com.epitech.epicture

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import com.epitech.epicture.config.Config


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.epitech.epicture", appContext.packageName)
    }

    @Test
    fun testClientId() {
        // Context of the app under test.
        assertEquals("46b221d18e1f905", Config.CLIENT_ID);
    }

    @Test
    fun testClientSecret() {
        // Context of the app under test.
        assertEquals("d9cd23bd0a58073b39bde13e1d06adc8514c219b", Config.CLIENT_SECRET);
    }
}

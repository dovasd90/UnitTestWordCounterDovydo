package com.example.wordcounterdovydo;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    private Context context;

    @Before
    public void setup() {
        context = InstrumentationRegistry.getInstrumentation().getTargetContext();
    }

    @Test
    public void useAppContext() {
        assertEquals("com.example.wordcounterdovydo", context.getPackageName());
    }

    @Test
    public void testGetCharsCount() {
        assertEquals(11, TextCounter.getCharsCount("Hello World"));
    }

    @Test
    public void testGetWordsCount() {
        assertEquals(2, TextCounter.getWordsCount("Hello World"));
    }

}

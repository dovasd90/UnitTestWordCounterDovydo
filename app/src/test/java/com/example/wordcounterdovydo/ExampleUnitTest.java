package com.example.wordcounterdovydo;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleUnitTest {

    @Test
    public void testGetCharsCount_EmptyInput() {
        assertEquals(0, TextCounter.getCharsCount(""));
    }

    @Test
    public void testGetCharsCount_NormalInput() {
        assertEquals(11, TextCounter.getCharsCount("Hello World"));
    }

    @Test
    public void testGetCharsCount_Spaces() {
        assertEquals(3, TextCounter.getCharsCount("   "));
    }

    @Test
    public void testGetWordsCount_EmptyInput() {
        assertEquals(0, TextCounter.getWordsCount(""));
    }

    @Test
    public void testGetWordsCount_NormalInput() {
        assertEquals(2, TextCounter.getWordsCount("Hello World"));
    }

    @Test
    public void testGetWordsCount_OnlySpaces() {
        assertEquals(0, TextCounter.getWordsCount("   "));
    }

    @Test
    public void testGetWordsCount_PunctuationNoWords() {
        assertEquals(0, TextCounter.getWordsCount("...!!!,,,???"));
    }

    @Test
    public void testGetCharsCount_NullInput() {
        assertEquals(0, TextCounter.getCharsCount(null));
    }

    @Test
    public void testGetWordsCount_NullInput() {
        assertEquals(0, TextCounter.getWordsCount(null));
    }
}

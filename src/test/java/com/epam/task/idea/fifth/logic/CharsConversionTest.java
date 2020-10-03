package com.epam.task.idea.fifth.logic;

import com.epam.idea.task.fifth.input.FileReader;
import com.epam.idea.task.fifth.logic.CharsConversion;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;

public class CharsConversionTest {
    private FileReader fileName = new FileReader("src/test/resources/testInput.txt");

    @Test
    public void testFormatTextShouldFormatWhenTextInputFromFile() throws FileNotFoundException {

        String convertedText = "Hello hello H ell o";

        CharsConversion text = new CharsConversion();
        String expectedText = text.formatText(fileName.read());

        Assert.assertEquals(convertedText, expectedText);
    }
}


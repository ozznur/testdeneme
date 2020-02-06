package org.example;

import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.StringEscapeUtils;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("hello world");
        String p="<p> My Paragraph. </p>";
        System.out.println(StringEscapeUtils.escapeHtml4(p));
    }


}

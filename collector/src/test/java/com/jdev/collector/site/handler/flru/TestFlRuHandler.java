/**
 * 
 */
package com.jdev.collector.site.handler.flru;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import com.jdev.collector.site.handler.ArticleWatcher;
import com.jdev.collector.site.handler.FlRuHandler;
import com.jdev.collector.site.handler.TestAbstractHandler;

/**
 * @author Aleh
 * 
 */
public class TestFlRuHandler extends TestAbstractHandler {

    /**
     * @return Iterable resources.
     */
    @Parameters(name = "{index}: file name - {0}, result file name - {1}")
    public static Iterable<String[]> data() {
        return Arrays
                .<String[]> asList(new String[] { "input.html", "input.html", "windows-1251" });
    }

    public TestFlRuHandler(final String fileName, final String resultFileName,
            final String charsetName) {
        super(fileName, resultFileName, charsetName);
    }

    @Test
    public void testContentSelection() {
        testHandler();
    }

    @Override
    protected ArticleWatcher createHandler() {
        return new FlRuHandler();
    }

}

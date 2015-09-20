package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by hxlin on 9/20/15.
 */
public class WelcomeInfoTests {

    private final ByteArrayOutputStream welcomeInfo = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(welcomeInfo));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void out() {
        System.out.print("Welcome to Bibiloteca");
        assertEquals("Welcome to Bibiloteca", welcomeInfo.toString());
    }

    @Test
    public void err() {
        System.err.print("something wrong, please reboot again");
        assertEquals("something wrong, please reboot again", errContent.toString());
    }
}

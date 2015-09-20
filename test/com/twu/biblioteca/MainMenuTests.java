package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hxlin on 9/20/15.
 */
public class MainMenuTests {

    @Test
    public void shouldReturnSeletedOption(){
        assertEquals(1, new MainMenu().getSelectedOption(1));
    }
}

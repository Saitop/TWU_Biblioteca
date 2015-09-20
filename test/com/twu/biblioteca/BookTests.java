package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by hxlin on 9/20/15.
 */
public class BookTests {
    @Test
    public void shouldGetBookDetails(){
        Book theGreatGatsby = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", "1925");
        Book refactoring = new Book(2,"Refactoring: Improving the Design of Existing Code", "Martin Fowler", "1999");
        Book tdd = new Book(3, "Test-Driven Development by Example", "Kent Beck", "2003");
        String theGreatGatsbyDetail = theGreatGatsby.getDetails();
        String refactoringDetail = refactoring.getDetails();
        String tddDetail = tdd.getDetails();

        assertThat(theGreatGatsbyDetail, is("The Great Gatsby | F. Scott Fitzgerald | 1925"));
        assertThat(refactoringDetail, is("Refactoring: Improving the Design of Existing Code | Martin Fowler | 1999"));
        assertThat(tddDetail, is("Test-Driven Development by Example | Kent Beck | 2003"));
    }

}

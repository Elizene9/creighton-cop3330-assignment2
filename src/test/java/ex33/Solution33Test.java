package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// These tests test all four randomly generated responses
class Solution33Test {

    @Test
    void response1() {

        assertEquals("Yes", Solution33.response(0));
    }

    @Test
    void response2() {

        assertEquals("No", Solution33.response(1));
    }

    @Test
    void response3() {;

        assertEquals("Maybe", Solution33.response(2));
    }

    @Test
    void response4() {

        assertEquals("Ask again later", Solution33.response(3));
    }
}
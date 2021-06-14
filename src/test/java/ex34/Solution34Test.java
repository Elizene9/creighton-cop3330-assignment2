package ex34;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {

    @Test
    void NameOmitsCorrectEmployee() {

        List<String> array = new ArrayList<>();
        array.add("John Smith");
        array.add("Jackie Jackson");
        array.add("Chris Jones");
        array.add("Amanda Cullen");
        array.add("Jeremy Goodwin");

        var flag = Solution34.name(array, "John Smith");
        assertEquals("John Smith", flag);
    }

    @Test
    void NameOmitsCorrectEmployee2() {

        List<String> array = new ArrayList<>();
        array.add("John Smith");
        array.add("Jackie Jackson");
        array.add("Chris Jones");
        array.add("Amanda Cullen");
        array.add("Jeremy Goodwin");

        var flag = Solution34.name(array, "Chris Jones");
        assertEquals("Chris Jones", flag);
    }

    @Test
    void NameOmitsCorrectEmployee3() {

        List<String> array = new ArrayList<>();
        array.add("John Smith");
        array.add("Jackie Jackson");
        array.add("Chris Jones");
        array.add("Amanda Cullen");
        array.add("Jeremy Goodwin");

        var flag = Solution34.name(array, "Jeremy Goodwin");
        assertEquals("Jeremy Goodwin", flag);
    }

    @Test
    void NameOmitsCorrectEmployee4() {

        List<String> array = new ArrayList<>();
        array.add("John Smith");
        array.add("Jackie Jackson");
        array.add("Chris Jones");
        array.add("Amanda Cullen");
        array.add("Jeremy Goodwin");

        var flag = Solution34.name(array, "John Smith");
        assertEquals("John Smith", flag);
    }
}
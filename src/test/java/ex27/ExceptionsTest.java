package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Test each method if it returns zero properly or 1
class ExceptionsTest {

    @Test
    void first_name_null_returns_0() {

        Exceptions check = new Exceptions();

        int flag = check.first_name_null("Bobby");

        assertEquals(0, flag);
    }

    @Test
    void first_name_null_returns_1() {

        Exceptions check = new Exceptions();

        int flag = check.first_name_null("");

        assertEquals(1, flag);
    }

    @Test
    void first_name_length_returns_0() {

        Exceptions check = new Exceptions();

        int flag = check.first_name_length("Bobby");

        assertEquals(0, flag);
    }

    @Test
    void first_name_length_returns_1() {

        Exceptions check = new Exceptions();

        int flag = check.first_name_length("c");

        assertEquals(1, flag);
    }

    @Test
    void last_name_null_returns_0() {

        Exceptions check = new Exceptions();

        int flag = check.last_name_null("Bobby");

        assertEquals(0, flag);
    }

    @Test
    void last_name_null_returns_1() {

        Exceptions check = new Exceptions();

        int flag = check.last_name_null("");

        assertEquals(1, flag);
    }

    @Test
    void last_name_length_returns_0() {

        Exceptions check = new Exceptions();

        int flag = check.last_name_length("Bobby");

        assertEquals(0, flag);
    }

    @Test
    void last_name_length_returns_1() {

        Exceptions check = new Exceptions();

        int flag = check.last_name_length("b");

        assertEquals(1, flag);
    }

    @Test
    void id_invalid_returns_0() {

        Exceptions check = new Exceptions();

        int flag = check.id_invalid("CC-9999");

        assertEquals(0, flag);
    }

    @Test
    void id_invalid_returns_1() {

        Exceptions check = new Exceptions();

        int flag = check.id_invalid("99-CCC4");

        assertEquals(1, flag);
    }

    @Test
    void id_invalid_returns_1_set2() {

        Exceptions check = new Exceptions();

        int flag = check.id_invalid("CC-99999");

        assertEquals(1, flag);
    }

    @Test
    void zip_returns_0() {

        Exceptions check = new Exceptions();

        int flag = check.zip(99999);

        assertEquals(0, flag);
    }

    @Test
    void zip_returns_1() {

        Exceptions check = new Exceptions();

        int flag = check.zip(9999);

        assertEquals(1, flag);
    }
}
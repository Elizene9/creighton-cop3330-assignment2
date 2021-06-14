package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise_25Test {

    @Test
    void password_is_very_strong() {
        Exercise_25 check = new Exercise_25();
        int flag = check.passwordValidator("1337h@xor!");
        assertEquals(4, flag);
    }

    @Test
    void password_string_very_strong() {
        Exercise_25 check = new Exercise_25();
        String strength = check.checkPassword(4);
        assertEquals("very strong", strength);
    }

    @Test
    void password_is_strong() {
        Exercise_25 check = new Exercise_25();
        int flag = check.passwordValidator("abc123xyz");
        assertEquals(3, flag);
    }

    @Test
    void password_string_strong() {
        Exercise_25 check = new Exercise_25();
        String strength = check.checkPassword(3);
        assertEquals("strong", strength);
    }

    @Test
    void password_is_weak() {
        Exercise_25 check = new Exercise_25();
        int flag = check.passwordValidator("abcdef");
        assertEquals(2, flag);
    }
    @Test
    void password_string_weak() {
        Exercise_25 check = new Exercise_25();
        String strength = check.checkPassword(2);
        assertEquals("weak", strength);
    }

    @Test
    void password_is_very_weak() {
        Exercise_25 check = new Exercise_25();
        int flag = check.passwordValidator("12345");
        assertEquals(1, flag);
    }

    @Test
    void password_string_very_weak() {
        Exercise_25 check = new Exercise_25();
        String strength = check.checkPassword(1);

        assertEquals("very weak", strength);
    }


}
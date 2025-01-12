package org.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RandomPasswordGeneratorTest {

    @Test
    void testGeneratePasswordLength() {
        int length = 12;
        String password = RandomPasswordGenerator.generatePassword(length);

        assertEquals(length, password.length(), "Wrong password length.");
    }

    @Test
    void testGeneratePasswordRandomness() {
        String password1 = RandomPasswordGenerator.generatePassword(12);
        String password2 = RandomPasswordGenerator.generatePassword(12);

        assertNotEquals(password1, password2, "Password should not match.");
    }

    @Test
    void testGeneratePasswordInvalidLength() {
        assertThrows(IllegalArgumentException.class, () -> RandomPasswordGenerator.generatePassword(0),
                "expected IllegalArgumentException thrown.");
    }
}

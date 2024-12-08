package test.java.com.datingapp;

import main.java.com.datingapp.Registration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegistrationTest {

    @Test
    void testValidRegistration() {
        Registration service = new Registration();
        boolean result = service.register("Érvényesfelhazsnáló", "ervenyesemail@example.com", "ervenyesjelszo123");
        assertTrue(result, "A regisztrációnak sikeresnek kell lennie érvényes adatok esetében.");
    }

    @Test
    void testInvalidUsername() {
        Registration service = new Registration();
        boolean result = service.register("ab", "ervenyesemail@example.com", "ervenyesjelszo123");
        assertFalse(result, "A regisztrációnak sikertelennek kell lennie érvénytelen felhasználónév esetében.");
    }

    @Test
    void testInvalidEmail() {
        Registration service = new Registration();
        boolean result = service.register("Érvényesfelhazsnáló", "érvénytelen-email", "ervenyesjelszo123");
        assertFalse(result, "A regisztrációnak sikertelennek kell lennie érvénytelen e-mail cím esetében.");
    }

    @Test
    void testInvalidPassword() {
        Registration service = new Registration();
        boolean result = service.register("Érvényesfelhazsnáló", "ervenyesemail@example.com", "short");
        assertFalse(result, "A regisztrációnak sikertelennek kell lennie érvénytelen jelszó esetében.");
    }
}


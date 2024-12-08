package test.java.com.datingapp;

 import main.java.com.datingapp.UserProfile;
 import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.*;

class UserProfileTest {

    @Test
    void testUserIsEligible() {
        UserProfile user = new UserProfile("Gipsz Jakab", "gipszjakab@gmail.com", 25);
        assertTrue(user.isEligibleForService(), "A 25 éves felhasználó jogosult a szolgáltatásra.");
    }

    @Test
    void testUserIsNotEligible() {
        UserProfile user = new UserProfile("Teszt Elek", "tesztelek@gmail.com", 16);
        assertFalse(user.isEligibleForService(), "A 16 éves felhasználó nem regisztrálhat");
    }

    @Test
    void testUserExactlyEligible() {
        UserProfile user = new UserProfile("Cserepes Virág", "cserepsvirag@gmail.com", 18);
        assertTrue(user.isEligibleForService(), "A 18 éves felhasználó regisztrálhat");
    }
}

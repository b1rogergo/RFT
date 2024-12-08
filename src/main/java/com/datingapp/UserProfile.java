package main.java.com.datingapp;

/**
 * A felhasználói profil osztály, amely tartalmazza a felhasználó alapvető adatait.
 */
public class UserProfile {
    private final String username;
    private final String email;
    private final int age;

    /**
     Létrehozza a felhasználói profil egy új példányát a megadott adatokkal.
     */
    public UserProfile(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    /**
     Visszaadja a felhasználó nevét.
     */
    public String getUsername() {
        return username;
    }

    /**
     Visszaadja a felhasználó e-mail címét.
     */
    public String getEmail() {
        return email;
    }

    /**
     Visszaadja a felhasználó életkorát.
     */
    public int getAge() {
        return age;
    }

    /**
     Ellenőrzi, hogy a felhasználó regisztrálhat-e.
     */
    public boolean isEligibleForService() {
        return age >= 18;
    }
}

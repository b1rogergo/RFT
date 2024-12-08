package main.java.com.datingapp;

import java.util.regex.Pattern;

/**
 A regisztrációs szolgáltatás osztálya, ellenőrzi a felhasználói adatokat és kezeli a regisztrációt.
 */
public class Registration {

    /**
     Regisztrál egy új felhasználót a megadott adatokkal.
     */
    public boolean register(String username, String email, String password) {
        return isUsernameValid(username) && isEmailValid(email) && isPasswordValid(password);
    }

    /**
     Ellenőrzi, hogy a felhasználónév érvényes-e.
     */
    private boolean isUsernameValid(String username) {
        return username != null && !username.trim().isEmpty() && username.length() >= 3 && username.length() <= 20;
    }

    /**
     Ellenőrzi, hogy az e-mail cím érvényes-e.
     */
    private boolean isEmailValid(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        return email != null && pattern.matcher(email).matches();
    }

    /**
     Ellenőrzi, hogy a jelszó érvényes-e.
     */
    private boolean isPasswordValid(String password) {
        return password != null && password.length() >= 8;
    }
}


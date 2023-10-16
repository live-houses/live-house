package livehouses;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class LiveHouseUser {
    private String username;
    private String email;
    private String password;
    private ArrayList<Ticket> tickets;
    private CreditCard creditCard;

    public void validateAndAddEmail(String email) {
        if (!EmailValidation.isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.email = email;
    }

    public class EmailValidation {
        private static final String EMAIL_REGEX = (
            "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"
        );

        public static boolean isValidEmail(String email) {
            return Pattern.matches(EMAIL_REGEX, email);
        }
    }

    public class PasswordValidation {
        private static final String PASSWORD_REGEX = (
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$"
            );

        public static boolean isValidPassword(String password) {
            return Pattern.matches(PASSWORD_REGEX, password);
        }
    }

    public class UsernameValidation {
        private static final String USERNAME_REGEX = "^[a-z0-9_-]{3,15}$";

        public static boolean isValidUsername(String username) {
            return Pattern.matches(USERNAME_REGEX, username);
        }
    }
}



package livehouses;

import java.util.regex.Pattern;

// Represents a loggeable user for the system
public class SystemUser {
    public int id;
    public String email;
    public String fullname;
    public int permissionBits;

    public SystemUser(int id, String email, String fullname, int permissionBits) {
        this.id = id;
        this.email = email;
        this.fullname = fullname;
        this.permissionBits = permissionBits;
    }

    public SystemUser() {
        this.email = "";
        this.fullname = "";
        this.permissionBits = 0;
    }

    public class EmailValidation {
        private static final String EMAIL_REGEX = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    
        public static boolean isValidEmail(String email) {
            return Pattern.matches(EMAIL_REGEX, email);
        }
    }

    public void printInformation() {
        System.out.println("Email: " + this.email);
        System.out.println("Fullname: " + this.fullname);
        System.out.println("Permissions: " + this.permissionBits);
    }
}

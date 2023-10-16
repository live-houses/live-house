package livehouses;

public class Administrator extends BaseUser{
    public Administrator(String username, String email, String password) {
        super(username, email, password, UserRole.Administrator);
    }
    // Métodos específicos para AdminUser
}

package livehouses;

public class AdminUser extends BaseUser {
    public AdminUser(String username, String email, String password) {
        super(username, email, password, UserRole.Manager);
    }

    // Método específicos para ManagerUser

}

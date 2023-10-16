package livehouses;

public class ManagerUser extends BaseUser {
    public ManagerUser(String username, String email, String password) {
        super(username, email, password, UserRole.Manager);
    }

    // Método específicos para ManagerUser
}

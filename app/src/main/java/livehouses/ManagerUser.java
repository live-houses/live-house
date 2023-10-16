package livehouses;

import livehouses.UserRole;

public class ManagerUser extends BaseUser {
    
    public enum UserRole{
        Regular,
        Manager,
        Administrator
    }

    public ManagerUser(String username, String email, String password) {
        super(username, email, password, UserRole.Manager);
    }

    // Método específicos para ManagerUser

}

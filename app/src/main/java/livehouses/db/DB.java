package livehouses.db;

import java.util.ArrayList;
import java.util.List;

import livehouses.Locale;
import livehouses.SystemUser;

public class DB {
    public static List<User> usersTable;
    public static List<DBLocale> localesTable;

    public static class User {
        private String email;
        private String fullname;
        private String password;
        private int id;

        // 1 - crear locales
        // 2 - modificar locales
        // 3 - crear gerentes
        // 4 - modificar permisos de gerentes
        // 5 - crear eventos
        // 6 - modificar eventos
        // 7 - acceder a analiticas de todos los locales
        private int permissionsBits = 0b0000000;

        public User(int id,
        String email, String fullname, String password, int permissions) {
            this.id = id;
            this.email = email;
            this.fullname = fullname;
            this.password = password;
            this.permissionsBits = permissions;
        }
    }

    public static class DBLocale {
        public int managerId;
        public String localName;
        public String direccion;

        public DBLocale(int managerId,String localName, String direccion) {
            this.managerId = managerId;
            this.localName = localName;
            this.direccion = direccion;
        }
    }

    public static void connect() {
        DB.usersTable = new ArrayList<User>() {{
            add(new User(1, "admin@unmsm.edu.pe", "Administrador", "123", 1));
            add(new User(2, "manager@mit.edu", "Jhon Doe", "hola", 0));
            add(new User(3, "dummy1@example.com", "Jhon Doe", "123", 0));
            add(new User(4, "organizador", "Juan Martinez", "123", 0));
        }};

        DB.localesTable = new ArrayList<DBLocale>() {{
            add(new DBLocale(1, "Live-house SiempreViva", "Av SiempreViva 123"));
            add(new DBLocale(2, "Live-house Rambla", "La Rambla de Huarochiri km123"));
            add(new DBLocale(3, "Live-house Camote", "Puente Camote calle 13"));
            add(new DBLocale(4, "Live-house Lurigancho", "Huarochiri, Santa Anita"));
        }};
    }

    // search for a given user in the users table
    public static SystemUser queryUser(String email, String password) throws UserNotFoundException {
        for (User user : DB.usersTable) {
            if (user.email.equals(email) && user.password.equals(password)) {
                return new SystemUser(
                    user.id,
                    user.email,
                    user.fullname,
                    user.permissionsBits
                );
            }
        }
        throw new UserNotFoundException();
    }

    // Creates a new user and returns que newly generated id
    public static int insertUser(String email, String fullname, String password, int permissions) {
        int generatedId = DB.usersTable.size() + 1;
        DB.usersTable.add(
            new User(generatedId, email, fullname, password, permissions)
        );
        return generatedId;
    }

    // show all locals
    public static List<Locale> getAllLocals() {
        List<Locale> locales = new ArrayList<>();

        for (DBLocale local : DB.localesTable) {
            locales.add(new Locale(local.managerId, local.localName, local.direccion));
        }
        return locales;
    }

    // TODO: return an id here
    public static void insertLocal(String address, String localName, int managerId) {
        DB.localesTable.add(
            new DBLocale(managerId, localName, address)
        );
    }
}

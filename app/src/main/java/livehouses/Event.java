package livehouses;

import java.util.ArrayList;

class PermissionException extends Exception {
    public PermissionException(String message) {
        super(message);
    }
}

class Event {
    private ArrayList<Act> acts;
    private String name;
    private int soldTickets;

    public ArrayList<Act> getActs() {
        return acts;
    }

    public void setActs(ArrayList<Act> acts, BaseUser user) throws PermissionException {
        if (user instanceof AdminUser || user instanceof ManagerUser) {
            this.acts = acts;
        } else {
            throw new PermissionException("Permisos insuficientes para editar acts del evento.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name, BaseUser user) throws PermissionException {
        if (user instanceof AdminUser || user instanceof ManagerUser) {
            this.name = name;
        } else {
            throw new PermissionException("Permisos insuficientes para editar el nombre del evento.");
        }
    }

    public int getSoldTickets() {
        return soldTickets;
    }

    public void setSoldTickets(int soldTickets, BaseUser user) throws PermissionException {
        if (user instanceof AdminUser || user instanceof ManagerUser) {
            this.soldTickets = soldTickets;
        } else {
            throw new PermissionException("Permisos insuficientes para editar el número de entradas vendidas.");
        }
    }
}

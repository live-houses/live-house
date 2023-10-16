package livehouses;

import java.util.ArrayList;

public class Event {
    
    private ArrayList<Act> acts;
    private String name;
    private int soldTickets;
    private Locale locale;

    public Event(String name, Locale locale) {
        this.name = name;
        this.locale = locale;
        this.acts = new ArrayList<>();
    }

    // Getters y setters para los atributos
}

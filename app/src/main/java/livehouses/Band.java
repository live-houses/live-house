package livehouses;

import java.util.ArrayList;
import java.util.Map;

class Color {
    private int r, g, b;

    public Color(int r, int g, int b) {
        if (r < 0 || r > 255) { throw new IllegalArgumentException("r must be between 0 and 255"); }
        if (g < 0 || g > 255) { throw new IllegalArgumentException("g must be between 0 and 255"); }
        if (b < 0 || b > 255) { throw new IllegalArgumentException("b must be between 0 and 255"); }
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String toString() {
        return String.format("rgb(%d, %d, %d)", r, g, b);
    }
}

public class Band {
    private String name;
    private ArrayList<String> genres;

    public static Map<String, Color> GENRE_COLORS = Map.of(
        "rock", new Color(255, 0, 0),
        "pop", new Color(0, 255, 0),
        "jazz", new Color(0, 0, 255),
        "metal", new Color(255, 255, 0),
        "reggaeton", new Color(255, 0, 255),
        "cumbia", new Color(0, 255, 255),
        "salsa", new Color(255, 255, 255),
        "bachata", new Color(255, 255, 255)
    );

    public Band(String name) {
        this.name = name;
        this.genres = new ArrayList<String>();
    }

    public Color getGenreColor(String genre) {
        return GENRE_COLORS.get(genre);
    }

    public void setGenres(ArrayList<String> genres) { this.genres = genres; }
    public void addGenre(String genre) { this.genres.add(genre); }
    public String getName() { return name; }
}

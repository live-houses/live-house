package livehouses;

import livehouses.utils.pretty.Printer;

public class Locale {
    public int managerId;
    public String localName;
    public String direccion;
    public Double[] latitudLongitud;

    public Locale(int managerID, String localName,  String direccion, Double[] latLon) {
        this.managerId = managerID;
        this.localName = localName;
        this.direccion = direccion;
        this.latitudLongitud = latLon;
    }

    public Locale() {
        this.managerId = 0;
        this.localName = "";
        this.direccion = "";
        this.latitudLongitud = new Double[2];
    }

    public void setLatLon(Double[] latLon){
        if (!isValidLatLon(latLon)) {
            throw new IllegalArgumentException("Latitud o longitud invalida");
        }
        this.latitudLongitud = latLon;
    }

    static boolean isValidLatLon(Double[] latLon) {
        if (latLon[0] < -90 || latLon[0] > 90) { return false; }
        if (latLon[1] < -180 || latLon[1] > 180) { return false; }
        return true;
    }

    public void printInformation() {
        Printer.print(this.localName, 244, 173, 244);
        Printer.newLine();
        Printer.print("Direccion: " + this.direccion);
        Printer.newLine();
        Printer.print("Manager ID: " + this.managerId);
        Printer.newLine();
        Printer.newLine();
    }
}


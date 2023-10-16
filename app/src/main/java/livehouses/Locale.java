package livehouses;

import livehouses.utils.pretty.Printer;

public class Locale {
    public int managerId;
    public String direccion;
    public String localName;

    public Locale(int managerID, String localName,  String direccion){
        this.managerId = managerID;
        this.localName = localName;
        this.direccion = direccion;
    }

    public Locale(){
        this.managerId = 0;
        this.localName = "";
        this.direccion = "";
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

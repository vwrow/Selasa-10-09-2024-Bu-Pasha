package PersewaanCD;

public class CD extends Product { //subclass or child
    
    protected String artist;
    protected int totalSong;
    protected String label;

    public CD() {

        number = 69;
        name = "Never Giving Up - CD";
        quantity = 1200;
        price = 4.2;

        artist = "Rick Astley";
        totalSong = 23;
        label = "Sony Entertainment";

    }

    public void CDprint() {

        System.out.println("");
        System.out.println("Currently Available CDs:");
        System.out.println("Number: " +number);
        System.out.println("Name: " +name);
        System.out.println("Artist: " +artist);
        System.out.println("Label: " +label);
        System.out.println("Total Songs: " +totalSong);
        System.out.println("Price: " +price);
        System.out.println("");
    }
}

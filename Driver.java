package PersewaanCD;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        String choice = "";
        CD cd = new CD();
        DVD dvd = new DVD();
        Scanner j = new Scanner(System.in);
        
        System.out.println("Ingin Membeli CD/ DVD?");
        choice = j.nextLine();

        if (choice.equalsIgnoreCase("CD")) {
            cd.CDprint();
        } else if (choice.equalsIgnoreCase("DVD")) {
            dvd.DVDprint();
        }
        
        j.close();
    } 
}
 
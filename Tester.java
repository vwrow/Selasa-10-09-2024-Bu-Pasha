package PersewaanCD;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        
        Scanner ad = new Scanner(System.in);

        try{
            System.out.println("How Many Objects Would You Like To Make?");
            int jum = ad.nextInt();
            System.out.println("Amount: " +jum);
        }catch (Exception e) {
            System.out.println("Wrong Data Type!");
        };

        System.out.print("Choose CD/ DVD (Case Sensitive): ");
        String pilihan = ad.next();

        if (pilihan.equals("CD")) {
            CD a = new CD();
            a.print();
        } else if (pilihan.equals("DVD")) {
            DVD b = new DVD();
            b.print();
        } else {
            System.out.println("Recheck Your Input");
        }
        ad.close();
    }
}

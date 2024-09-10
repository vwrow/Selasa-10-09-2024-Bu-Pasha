package PersewaanCD;

public class DVD extends Product { //subclass or child
    
    protected int length;
    protected String rating;
    protected String studio;

    public DVD() {

        number = 42;
        name = "Never Giving Up - DVD";
        quantity = 1000;
        price = 6.9;

        length = 69;
        rating = "Parental Guidance";
        studio = "Sony Entertainment";

    }

    public void DVDprint() {

        System.out.println("");
        System.out.println("Currently Available DVDs:");
        System.out.println("Number: " +number);
        System.out.println("Name: " +name);
        System.out.println("Studio: " +studio);
        System.out.println(rating +" Rated");
        System.out.println("Length: " +length);
        System.out.println("Price: " +price);
        System.out.println("");
    }
}

package de.neuefische;

public class Main {

    public static void main(String[] args) {

        Piano piano = new Piano(
                3000.00, "Black", 12
        );

        Violin violin = new Violin(
                200.00, "Red", 4
        );

        Handy handy1 = new Handy();



        CanMakeNoise guitar = new Handy();

        recordNoise(guitar);

    }

    //Polymorphism
    public static void printInstrument(Instrument instrument){
        System.out.println(instrument);
    }

    public static void recordNoise(CanMakeNoise canMakeNoise){
        System.out.println("Sound Check");
        canMakeNoise.makeNoise();
        System.out.println("=====================");
    }

}
package de.neuefische;

public class Handy implements CanMakeNoise{

    @Override
    public void makeNoise() {
        System.out.println("The Handy Rings");
    }

    @Override
    public void getLouder() {
        System.out.println("You turn up the Volume");
    }
}

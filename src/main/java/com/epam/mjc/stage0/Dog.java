package com.epam.mjc.stage0;

public class Dog extends Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Dog() {
    }

    public Dog(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
        this.color = "brown";
        this.numberOfPaws = 4;
        this.hasFur = true;
    }





    @Override
    public String getDescription() {
        return "This animal is mostly brown. It has 4 paws and a fur.";
    }
}

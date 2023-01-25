package com.epam.mjc.stage0;

public class Bird extends Animal {
    private String colorBird;
    private int numberOfPawsBird;
    private boolean hasFurBird;

    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
        this.colorBird = "blue";
        this.numberOfPawsBird = 2;
        this.hasFurBird = false;
    }

    public Bird() {
    }

    @Override
    public String getDescription() {
        return "This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.";
    }
}

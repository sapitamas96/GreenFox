package com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument{

    public ElectricGuitar() {
        super(6);
    }

    public ElectricGuitar(int number) {
        super(number);
    }

    @Override
    String sound() {
        return "Twang";
    }
}

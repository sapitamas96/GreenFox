package com.greenfoxacademy.music;

public class Violin extends StringedInstrument{

    public Violin() {
        super(4);
    }

    public Violin(int numberOfStrings) {
        super(numberOfStrings);
    }

    @Override
    String sound() {
        return "Screech";
    }
}

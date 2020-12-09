package com.greenfoxacademy.music;

public class BassGuitar extends StringedInstrument{

    public BassGuitar() {
        super(4);
    }

    public BassGuitar(int numberOfStrings) {
        super(numberOfStrings);
    }

    @Override
    String sound() {
        return "Duum-duum-duum";
    }


}

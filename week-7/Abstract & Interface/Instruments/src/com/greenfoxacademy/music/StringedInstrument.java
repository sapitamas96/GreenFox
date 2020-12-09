package com.greenfoxacademy.music;

public abstract class StringedInstrument extends Instrument{

    protected int numberOfStrings;

    abstract String sound();

    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    void play() {
        System.out.println(super.nameOfInstrument + ", a " + this.numberOfStrings + "-stringed instrument that goes " + sound());
    }
}

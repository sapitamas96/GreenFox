package com.greenfoxacademy.music;

public abstract class Instrument {

    protected String nameOfInstrument;

    abstract void play();

    public Instrument() {
        this.nameOfInstrument = Instrument.class.getSimpleName();
    }
}

package com.tamas;

public class Sharpe {

    private String colour;
    private double width;
    private double inkAmount;

    public Sharpe(String colour, double width) {
        this.colour = colour;
        this.width = width;
        this.inkAmount = 100;
    }

    public void paint() {
        this.inkAmount--;
    }
}

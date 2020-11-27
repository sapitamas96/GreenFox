package com.tamas;

public class Main {

    public static void main(String[] args) {
//        Készíts egy Sharpie osztályt
//        Minden filctollról tudnunk kell:
//        annak színét color (legyen egy String),
//                vastagságát width (ami legyen egy lebegőpontos szám),
//                tinta mennyiségét inkAmount (egy másik lebegőpontos szám)
//        Amikor létrehozunk egyet csak a színt és a vastagságot kell megadnunk
//        Minden filctoll alapértelmezett tinta mennyisége: 100
//        Tudjuk használni use() a filctollakat
//        ami által csökken a tinta mennyiségük

        Sharpe blue = new Sharpe("Blue", 0.5);
        blue.paint();
        blue.paint();
        blue.paint();
        blue.paint();

    }
}

package com.tamas;

public class Main {

    public static void main(String[] args) {
	    Ship marie = new Ship("Marie");
	    marie.fillShip();

        Ship catherine = new Ship("Catherine");
        catherine.fillShip();

        System.out.println(marie.battle(catherine));
        System.out.println(marie);
        System.out.println(catherine);


    }
}

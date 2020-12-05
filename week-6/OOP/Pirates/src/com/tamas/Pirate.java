package com.tamas;

import java.util.Random;

public class Pirate {

    enum LevelOfIntoxication {
        LOW,
        MEDIUM,
        HIGH
    }

    private int numberOfDrinks;
    private LevelOfIntoxication levelOfIntoxication;
    private boolean isAlive;
    private String name;

    public Pirate(String name) {
        this.name = name;
        this.isAlive = true;
        this.numberOfDrinks = 0;
        this.levelOfIntoxication = LevelOfIntoxication.LOW;

    }

    public void drinkSomeRum() {
        if (!isAlive) {
            return;
        }

        numberOfDrinks++;
        if (numberOfDrinks < 3) {
            levelOfIntoxication = LevelOfIntoxication.LOW;
        } else if ( numberOfDrinks < 6) {
            levelOfIntoxication = LevelOfIntoxication.MEDIUM;
        } else {
            levelOfIntoxication = LevelOfIntoxication.HIGH;
        }
    }

    public void howsItGoingMate() {
        if (!isAlive) {
            System.out.println("He is dead!");
            return;
        }

        Random random = new Random();
        int randomNumber = random.nextInt(5);

        if (randomNumber == 4) {
            System.out.println("Pour me anudder!");
            drinkSomeRum();
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            passOut();
        }
    }

    public void die() {
        isAlive = false;
        System.out.println(this.name + " died!");
    }

    public void brawl(Pirate pirate) {
        if (!isAlive) {
            System.out.println("He is dead!");
            return;
        }

        int randomNumber = (int)(Math.random() * 3);

        if (randomNumber == 0) {
            passOut();
            pirate.passOut();
            System.out.println("Both passed out!");
        } else if (randomNumber == 1) {
            die();
        } else {
            pirate.die();
        }
    }

    private void passOut() {
        levelOfIntoxication = LevelOfIntoxication.LOW;
        numberOfDrinks = 0;
    }

    public String getName() {
        return name;
    }

    public LevelOfIntoxication getLevelOfIntoxication() {
        return levelOfIntoxication;
    }

    @Override
    public String toString() {
        return "\n" + name + "\n\t isAlive: " + isAlive;
    }

    public boolean isAlive() {
        return isAlive;
    }
}

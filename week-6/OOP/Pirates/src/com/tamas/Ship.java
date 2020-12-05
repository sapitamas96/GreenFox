package com.tamas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {


    private Pirate captain;
    private ArrayList<Pirate> crew;
    private String shipName;

    public Ship(String shipName) {
        this.shipName = shipName;
    }

    public void fillShip() {
        captain = new Pirate("Captain " + randomPirateName());
        int randomNumber = randomNumber(30);
        crew = new ArrayList<>();

        for (int i = 0; i < randomNumber; i++) {
            crew.add(new Pirate(randomPirateName()));
        }
    }

    public boolean battle(Ship opponent) {
        boolean isWinner = calculateScore() > opponent.calculateScore();
        boolean flag = false;

        if (isWinner) {
            party();
            opponent.casualties();
        } else {
            casualties();
            opponent.party();
        }

        return isWinner;
    }

    private void party() {
        int consumedRum = randomNumber(10);

        for (int i = 0; i < consumedRum; i++) {
            captain.drinkSomeRum();
        }

        for (Pirate pirate : crew) {
            consumedRum = randomNumber(10);
            for (int i = 0; i < consumedRum; i++) {
                if(pirate.isAlive()) {
                    pirate.drinkSomeRum();
                }
            }
        }
    }

    private void casualties() {
        int numberOfCasualties = randomNumber(getNumberOfPirates());
        int counter = numberOfCasualties;

        if (grimReaper(numberOfCasualties)) {
            captain.die();
            counter--;
        }

        while (counter > 0) {
            for (Pirate pirate : crew) {
                if (pirate.isAlive() && grimReaper(numberOfCasualties)) {
                    pirate.die();
                    counter--;
                }
            }
        }
    }

    private boolean grimReaper(int numberOfCasualties) {
        return numberOfCasualties / (getNumberOfPirates())* 100 <= randomNumber(100);
    }

    private String randomPirateName() {
        Path filePath = Paths.get("src\\com\\tamas\\pirateNames.txt");
        int randomIndex = randomNumber(50) - 1;
        try {
            List<String> lines = Files.readAllLines(filePath);
            return lines.get(randomIndex);

        } catch (IOException e) {
            return null;
        }
    }

    private int randomNumber(int number) {
        Random random = new Random();
        return random.nextInt(number) + 1;
    }

    private int getNumberOfPirates() {
        int numberOfCrew = 0;

        if (captain.isAlive()) {
            numberOfCrew++;
        }

        for (Pirate pirate : crew) {
            if (pirate.isAlive()) {
                numberOfCrew++;
            }
        }
        return numberOfCrew;
    }

    private int calculateScore() {
        int crewScore = getNumberOfPirates();
        int sum = 0;

        if (captain.isAlive()) {
            sum += 5;
        } else {
            sum -= 5;
        }

        switch (captain.getLevelOfIntoxication()) {
            case LOW:
                sum += 10;
            case MEDIUM: //Empty;
            case HIGH:
                sum -= 10;
        }

        return sum + crewScore;

    }

    @Override
    public String toString() {
        return "Ship name: " + this.shipName +
                "\nCaptain: " + captain.getName() +
                "\n\t isAlive: " + captain.isAlive() +
                "\n\tcrew" + crew;
    }
}

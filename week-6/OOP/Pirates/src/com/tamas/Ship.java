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
          /*TODO:
               - The loser crew has a random number of losses (deaths).
               - The winner captain and crew has a party, including a random number of rum :)
          */
        return calculateScore() > opponent.calculateScore();
    }

    private String randomPirateName() {
        Path filePath = Paths.get("src\\com\\tamas\\pirateNames.txt");
        int randomNumber = randomNumber(50);
        try {
            List<String> lines = Files.readAllLines(filePath);
            return lines.get(randomNumber);

        } catch (IOException e) {
            return null;
        }
    }

    private int randomNumber(int number) {
        Random random = new Random();
        return random.nextInt(number);
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

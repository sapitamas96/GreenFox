package com.tamas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // Van egy listád, ami dominókat tartalmaz
        // Rendezd őket össze egy kígyóba úgy, hogy a szomszédos elemek ugyanazokat a számokat tartalmazzák a szomszédos oldalaikon
        // Példa: [2, 4], [4, 3], [3, 5] ...

        System.out.println(dominoes);
        System.out.println(order(dominoes));
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }

    public static List<Domino> order(List<Domino> dominoes) {
        int counter = 0;
        ArrayList<Domino> tmp = new ArrayList<>(Collections.singletonList(dominoes.get(0)));
        for (int i = 0; i < dominoes.size(); i++) {
            if (tmp.get(counter).getRightSide() == dominoes.get(i).getLeftSide()) {
                    tmp.add(dominoes.get(i));
                    counter++;
                    i = 0;
            }

        }

        return tmp;
    }
}

package com.company;

public class Színek {

    public static void main(String[] args) {
        // - Készíts egy kétdimenziós tömböt
        //   ami megadott színek különböző árnyalatait tartalmazza
        // - A `colors[0]` a zöld árnyalatait tárolja:
        //   `"lime", "forest green", "olive", "pale green", "spring green"`
        // - A `colors[1]` a piros árnyalatait:
        //   `"orange red", "red", "tomato"`
        // - A `colors[2]` pedig a pink árnyalatait:
        //   `"orchid", "violet", "pink", "hot pink"`

        String[] green = {"lime", "forest green", "olive", "pale green", "spring green"};
        String[] red = {"orange red", "red", "tomato"};
        String[] pink = {"orchid", "violet", "pink", "hot pink"};

        String[][] colours = {green, red, pink};
    }
}

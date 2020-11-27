package com.tamas;

public class Main {

    public static void main(String[] args) {
//        Készíts egy PostIt osztályt, amelynek van
//        backgroundColor (háttérszíne), amelyet egy String reprezentál
//        text (szövege), amit ráírtak
//        textColor (szöveg színe), amit szintén egy String reprezenát
//        Készíts néhány minta post-it példányt:
//        egy narancssárgát kék szöveggel: "Ötlet 1"
//        egy rózsaszínt fekete szöveggel: "Csodálatos"
//        egy citromsárgát zöld szöveggel: "Fenséges!"

        PostIt orange = new PostIt();
        orange.backgroundColor = "Orange";
        orange.textColor = "Blue";
        orange.text = "Idea 1";

        PostIt pink = new PostIt();
        pink.backgroundColor = "Pink";
        pink.textColor = "Black";
        pink.text = "Wonderful";

        PostIt yellow = new PostIt();
        yellow.backgroundColor = "Yellow";
        yellow.textColor = "Green";
        yellow.text = "Majestic!";

    }
}

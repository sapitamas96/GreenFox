package com.tamas;

public class Bunny {

    public static void main(String[] args) {
        // Egy bizonyos számú nyuszikánk van és minden nyuszinak két nagy, lapát füle.
        // Ki szeretnénk számolni az összes nyuszifül számát rekurzívan
        // (ciklusok és szorzás nélkül).

        System.out.println(bunny(9));
    }

    private static int bunny(int i) {
        return i == 0 ? 0 : 2 + bunny(i -1);
    }
}

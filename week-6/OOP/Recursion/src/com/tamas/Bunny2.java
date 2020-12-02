package com.tamas;

public class Bunny2 {

    public static void main(String[] args) {
        // A nyuszikáink egy sorban állnak megszámozva 1, 2, 3, 4, ...
        // A páratlan nyusziknak (1, 3, ...) 2 fülük van.
        // A páros nyusziknak (2, 4, ..) most 3 fülük van, mert
        // mindegyik felemeli az egyik lábát is.
        // Rekurzívan térj vissza a sorban álló nyuszik
        // füleinek számával 1, 2, ... n (ciklusok és szorzás nélkül).

        System.out.println(bunnies(9));
    }

    private static int bunnies(int i) {
        return i == 0 ? 0 : i % 2 == 0 ? 2 + bunnies(i -1) : 3 + bunnies(i -1);
    }
}

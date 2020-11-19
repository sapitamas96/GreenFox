package com.company;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {

    final static HashMap<String, String> telephoneBook = new HashMap<>();

    public static void main(String[] args) {

        telephoneBook.put("William A. Lathan", "405-709-1865");
        telephoneBook.put("John K. Miller", "402-247-8568");
        telephoneBook.put("Hortensia E. Foster", "606-481-6467");
        telephoneBook.put("Amanda D. Newland", "319-243-5613");
        telephoneBook.put("Brooke P. Askew", "307-687-2982");
        System.out.println(findPhoneNumber("John K. Miller"));
        System.out.println(findName("307-687-2982"));
        System.out.println(findPhoneNumber("Chris E. Myers"));
    }

    public static String findPhoneNumber(String name) {
        return telephoneBook.get(name) == null ? "No such contact!" : telephoneBook.get(name);
    }

    public static String findName(String phoneNumber) {
        for (Map.Entry entry : telephoneBook.entrySet()) {
            if (phoneNumber.equals(entry.getValue())) {
                return entry.getKey().toString();
            }
        }
        return "No contacts for that number";
    }

}

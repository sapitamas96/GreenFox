package com.tamas;

public class Gnirts implements CharSequence{

    private String text;

    public Gnirts(String text) {
        this.text = new StringBuilder(text).reverse().toString();

    }

    @Override
    public int length() {
        return text.length();
    }

    @Override
    public char charAt(int index) {
        return text.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return text.subSequence(start, end);
    }
}

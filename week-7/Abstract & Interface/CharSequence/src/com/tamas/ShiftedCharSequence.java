package com.tamas;

public class ShiftedCharSequence implements CharSequence{

    private String text;

    public ShiftedCharSequence(String text, int shiftBy) {
        this.text = shift(text, shiftBy);
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

    private String shift(String text, int shiftBy) {
        return text.substring(shiftBy) + text.substring(0, shiftBy);
    }
}

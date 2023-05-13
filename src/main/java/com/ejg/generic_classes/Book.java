package com.ejg.generic_classes;

public class Book implements GiftItem {
    @Override
    public Occasion getOccasion() {
        return Occasion.BIRTHDAY;
    }
}

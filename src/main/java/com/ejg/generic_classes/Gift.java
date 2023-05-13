package com.ejg.generic_classes;

public class Gift<T extends GiftItem> {
    private final T t;

    public Gift(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void wrap() {
        switch (t.getOccasion()) {
            case NEW_SHOW -> System.out.println("Use golden paper");
            case NEW_BOOK -> System.out.println("use striped paper");
            case BIRTHDAY -> System.out.println("Use glitter paper");
        }
    }

}

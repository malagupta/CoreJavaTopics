package com.ejg.method_overloading;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant {
    public static void main(String[] args) {

    }

    static Food orderFood(String foodItemName) {
        return new Food(foodItemName);
    }

    static void orderFood(String foodItemName, int count) {
        System.out.println(foodItemName);
    }

    void orderFood(int count, String foodItemName) {
        System.out.println(foodItemName);
    }

    List<Food> orderFood(String foodItemName1, String foodItemName2) {
        final var foods = new ArrayList<Food>();
        foods.add(new Food(foodItemName1));
        foods.add(new Food(foodItemName2));
        return foods;
    }

    List<Food> orderFood(String[] foodItemNames) {
        final var foods = new ArrayList<Food>();

        Arrays.stream(foodItemNames)
                .forEach(e -> foods.add(new Food(e)));
        return foods;
    }
}










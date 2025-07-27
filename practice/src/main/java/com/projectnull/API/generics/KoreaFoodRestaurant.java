package com.projectnull.API.generics;

public class KoreaFoodRestaurant<T extends KoreanFood> {

    private T food;

    public KoreaFoodRestaurant(){}

    public KoreaFoodRestaurant(T food) {
        this.food = food;
    }
    public void setFood(T food) {
        this.food = food;
    }
    public T getFood() {
        return food;
    }
}

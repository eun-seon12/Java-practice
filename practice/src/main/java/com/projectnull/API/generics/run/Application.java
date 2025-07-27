package com.projectnull.API.generics.run;

import com.projectnull.API.generics.KimchiStew;
import com.projectnull.API.generics.KoreaFoodRestaurant;
import com.projectnull.API.generics.KoreanFood;
import com.projectnull.API.generics.Stew;

public class Application {

    public static void main(String[] args) {

        KoreaFoodRestaurant<KoreanFood> rt = new KoreaFoodRestaurant<>();
        KoreaFoodRestaurant<Stew> rt2 = new KoreaFoodRestaurant<>();
        KoreaFoodRestaurant<KimchiStew> rt3 = new KoreaFoodRestaurant<>();

        rt.setFood(new KoreanFood());
        (rt.getFood()).taste();

        rt2.setFood(new Stew());
        (rt2.getFood()).taste();

        rt3.setFood(new KimchiStew());
        (rt3.getFood()).taste();
    }
}

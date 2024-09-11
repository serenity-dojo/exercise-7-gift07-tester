package com.serenitydojo;

public class Cat extends Pet{

    private String favoriteToy;
    String favoritefood;
   public static String CAT_NOISE = "Meow";

   public String favoriteFood(){
       return "tuna";
   }
   public Cat(String name,int age){
       super(name,age);

       this.favoritefood = favoriteFood();

   }

    public Cat(String name, String favoriteToy, int age) {
        super(name, age);
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    @Override
    public String play() {
        return "plays with string";
    }
    public String makeNoise(){
        return CAT_NOISE;
    }
}

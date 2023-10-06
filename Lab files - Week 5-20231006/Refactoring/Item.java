package com.example;
// SOURCED FROM https://github.com/emilybache/GildedRose-Refactoring-Kata

/* Task 1: Refactor the code below by following good encapsulation principles 
 * (add access modifiers for variables)
 * (rename variables for clarity)
 * (insert accessors/mutators as needed)
 * (modify the toString as appropriate)
 */
public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public boolean expired;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        if(sellIn < 0) expired = true;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality + ", " + this.expired;
    }
}



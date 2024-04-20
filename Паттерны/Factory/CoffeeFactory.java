package com.lukaskeyn;

public class CoffeeFactory {
    private Coffee coffee;
 public Coffee createCoffee(CofeeType type){
     switch (type){
         case ESPRESSO -> coffee = new Espresso();
         case LATTE -> coffee = new Latte();
         case AMERICANO -> coffee = new Americano();
         case CAPPUCCINO-> coffee = new Cappuccino();
     }
     return coffee;
 }


}

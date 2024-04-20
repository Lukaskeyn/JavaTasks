package com.lukaskeyn;

public class CoffeeShop {
  private final CoffeeFactory coffeeFactory;
  public CoffeeShop(CoffeeFactory coffeeFactory){
      this.coffeeFactory = coffeeFactory;
  }
  public void orderCoffee(CofeeType type){
     Coffee coffee = coffeeFactory.createCoffee(type);
      System.out.println("Заказ получен - " + type.name());
      coffee.makeCoffee();
      coffee.grindCoffee();
      coffee.pourIntoCup();
      System.out.println("Заказ выполнен -  вот ваш " + type.name());
  }

}

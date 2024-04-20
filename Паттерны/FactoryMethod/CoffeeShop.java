package com.lukaskeyn;

public abstract class CoffeeShop {
  public void orderCoffee(CofeeType type){
     Coffee coffee = createCoffee(type);
      System.out.println("Заказ получен - " + type.name());
      coffee.makeCoffee();
      coffee.grindCoffee();
      coffee.pourIntoCup();
      System.out.println("Заказ выполнен -  вот ваш " + type.name());
  }
   public abstract Coffee createCoffee(CofeeType type);
}

package com.lukaskeyn;

public class AmericanCoffeeShop extends CoffeeShop{
    private final String country = "USA";

    public String getCountry() {
        return country;
    }
    @Override
    public void orderCoffee(CofeeType type) {
        Coffee coffee = createCoffee(type);
        System.out.println("Заказ получен - " + type.name() + ": " + getCountry());
        coffee.makeCoffee();
        coffee.grindCoffee();
        coffee.pourIntoCup();
        System.out.println("Заказ выполнен -  вот ваш " + type.name() + ": " + getCountry());
    }

    @Override
    public Coffee createCoffee(CofeeType type) {
       Coffee coffee = null;
       switch (type){
           case CAPPUCCINO -> coffee = new AmericanStyleCappuccino();
           case LATTE -> coffee = new AmericanStyleLatte();
           case ESPRESSO -> coffee = new AmericanStyleEspresso();
           case AMERICANO -> coffee = new AmericanStyleAmericano();
       }
       return coffee;
    }
}

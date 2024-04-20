package com.lukaskeyn;

public class ItalianCoffeeShop extends CoffeeShop {
    private final String country = "Italy";

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
            case CAPPUCCINO -> coffee = new ItalianStyleCappuccino();
            case LATTE -> coffee = new ItalianStyleLatte();
            case ESPRESSO -> coffee = new ItalianStyleEspresso();
            case AMERICANO -> coffee = new ItalianStyleAmericano();
        }
        return coffee;
    }
}

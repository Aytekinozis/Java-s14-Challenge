package com.workintech.burgercompany;

public class DeluxeBurger extends Hamburger{
    private boolean cips;
    private boolean drink;

    public DeluxeBurger() {
        super("Deluxe Burger", 19.19, "Double Sandwich");
        super.setMeat("Double");
        this.cips = true;
        this.drink = true;
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }
}

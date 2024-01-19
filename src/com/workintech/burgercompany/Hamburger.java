package com.workintech.burgercompany;

public class Hamburger {
    private String name;
    private String meat = "Normal";
    private String breadRollType;
    private double price;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public Hamburger(String name, double price, String breadRollType) {
        this.name = name;
        //this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name= addition1Name;
        this.addition1Price= addition1Price;
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Name= addition2Name;
        this.addition2Price= addition2Price;
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Name= addition3Name;
        this.addition3Price= addition3Price;
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        this.addition4Name= addition4Name;
        this.addition4Price= addition4Price;
    }

    public void itemizeHamburger(){
        String addition1 = addition1Name == null ? "" : ", Addition1: " + addition1Name;
        String addition2 = addition2Name == null ? "" : ", Addition2: " + addition2Name;
        String addition3 = addition3Name == null ? "" : ", Addition3: " + addition3Name;
        String addition4 = addition4Name == null ? "" : ", Addition4: " + addition4Name;
        this.price = price + addition1Price + addition2Price + addition3Price + addition4Price;
        System.out.println("Name: "+ getName() + ", Meat: " + getMeat() +
                ", BreadRollType: " + getBreadRollType() + addition1 + addition2 + addition3 +
                addition4 + ", Price: " + getPrice());
    }

    public String getName() {
        return name;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        return price;
    }
}

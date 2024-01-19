package com.workintech.burgercompany;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, price, breadRollType);
        super.setMeat("Tofu");
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name= healthyExtra1Name;
        this.healthyExtra1Price= healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name= healthyExtra2Name;
        this.healthyExtra2Price= healthyExtra2Price;
    }

    @Override
    public void itemizeHamburger() {
        String addition1 = getAddition1Name() == null ? "" : ", Addition1: " + getAddition1Name();
        String addition2 = getAddition2Name() == null ? "" : ", Addition2: " + getAddition2Name();
        String addition3 = getAddition3Name() == null ? "" : ", Addition3: " + getAddition3Name();
        String addition4 = getAddition4Name() == null ? "" : ", Addition4: " + getAddition4Name();
        String healthyAddition1 = healthyExtra1Name == null ? "" : ", HealthyAddition1: " + healthyExtra1Name;
        String healthyAddition2 = healthyExtra2Name == null ? "" : ", HealthyAddition2: " + healthyExtra2Name;
        setPrice(super.getPrice()+super.getAddition1Price()+super.getAddition2Price()+
        super.getAddition3Price()+super.getAddition4Price()+this.healthyExtra1Price+
                this.healthyExtra2Price);
        System.out.println("Name: "+ getName() + ", Meat: " + getMeat() +
                ", BreadRollType: " + getBreadRollType() + addition1 + addition2 + addition3 +
                addition4 + healthyAddition1 + healthyAddition2 + ", Price: " + getPrice());
    }
}

package net.beverages.types;

public class FruitJuice extends ColdBeverage {

    @Override
    public String doNotSpill() {
        return "Don't spill fruit juice is too precious.";
    }

    @Override
    public String drink() {
        return "Drinking a Fruit Juice so : " + this.doNotSpill() ;
    }
}

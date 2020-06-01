package net.beverages.types;

import net.beverages.Beverage;

public class HotBeverage extends Beverage {

    private int temperature;

    public HotBeverage(){
        this.temperature = 60;
    }

    @Override
    public String drink() {
        return "drink a hot beverage";
    }

    public String drinkSlowly() {
        return "Drink slow this is hot";
    }

    public void setTemperature( int temperature ) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return this.temperature;
    }

}

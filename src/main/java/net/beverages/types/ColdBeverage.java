package net.beverages.types;

import net.beverages.Beverage;

public class ColdBeverage extends Beverage {

    private int temperature;

    public ColdBeverage(){
        this.temperature = -16;
    }

    @Override
    public String drink() {
        return "drink a cold beverage";
    }

    public String doNotSpill() {
        return "Don't spill your cold drink!";
    }


    public void setTemperature( int temperature ) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return this.temperature;
    }
}

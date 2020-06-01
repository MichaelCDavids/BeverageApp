package net.beverages.temperatures;

import net.beverages.types.ColdBeverage;

public class Fridge implements Coolable{

    public ColdBeverage coldBeverage;

    public Fridge( ColdBeverage coldBeverage ){
            this.coldBeverage = coldBeverage;
    }

    public void coolDownWith( int chillFactor ) {
        int newTemperature = this.coldBeverage.getTemperature() - chillFactor;
        this.coldBeverage.setTemperature(newTemperature);
    }

    public int currentTemperature() {
        return this.coldBeverage.getTemperature();
    }

    public void coolForMinutes(){
        // cool your drink down with 3 degrees
        this.coldBeverage.setTemperature(this.coldBeverage.getTemperature() - 3);
    }

    public void coolForHours(){
        // cool your drink down with 10 degrees
        this.coldBeverage.setTemperature(this.coldBeverage.getTemperature() - 10);
    }

    public void coolForDays(){
        // cool your drink down with 20 degrees
        this.coldBeverage.setTemperature(this.coldBeverage.getTemperature() - 20);
    }
}

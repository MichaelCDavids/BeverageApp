package net.beverages.temperatures;

import net.beverages.types.HotBeverage;

public class Microwave implements Heatable{

    public HotBeverage hotBeverage;

    public Microwave( HotBeverage hotBeverage ){
        this.hotBeverage = hotBeverage;
    }

    public void low(){
        //heat drink up to 30 degrees
        this.hotBeverage.setTemperature(this.hotBeverage.getTemperature() + 30);
    }
    public void medium(){
        //heat drink up to 60 degrees
        this.hotBeverage.setTemperature(this.hotBeverage.getTemperature() + 60);
    }
    public void high(){
        //heat drink up to 90 degrees
        this.hotBeverage.setTemperature(this.hotBeverage.getTemperature() + 90);
    }

    public void heatUpTo( int heatFactor ) {
        this.hotBeverage.setTemperature(heatFactor);
    }

    @Override
    public int currentTemperature() {
        return this.hotBeverage.getTemperature();
    }
}

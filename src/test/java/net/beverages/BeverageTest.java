package net.beverages;

import net.beverages.temperatures.Fridge;
import net.beverages.temperatures.Microwave;
import net.beverages.types.ColdBeverage;
import net.beverages.types.FruitJuice;
import net.beverages.types.HotBeverage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeverageTest {

    @Test
    public void shouldBeAbleToCreateABeverage() {

        Beverage beverage = new Beverage();
        assertEquals("drink a beverage",beverage.drink());

    }

    @Test
    public void olwethuShouldBeAbleToDrinkABeverage() {

        Beverage beverage = new Beverage();
        Person olwethu = new Person();

        assertEquals("drink a beverage", olwethu.drinkBeverage(beverage));

    }

    @Test
    public void olwethuShouldBeAbleToDrinkAHotDrink() {

        Beverage beverage = new HotBeverage();

        Person olwethu = new Person();

        assertEquals("drink a hot beverage", olwethu.drinkBeverage(beverage));

    }


    @Test
    public void olwethuShouldBeAbleToDrinkAColdDrink() {

        Beverage beverage = new ColdBeverage();

        System.out.println( beverage instanceof Beverage );
        System.out.println( beverage instanceof HotBeverage);
        System.out.println( beverage instanceof ColdBeverage );
        Person olwethu = new Person();

        assertEquals("drink a cold beverage", olwethu.drinkBeverage(beverage));

    }

    @Test
    public void shouldBeAbleToDrinkHotBeverageSlowly() {
        Beverage beverage = new HotBeverage();
        HotBeverage hotBeverage = (HotBeverage) beverage;

        Person olwethu = new Person();
        assertEquals("drink a hot beverage", olwethu.drinkBeverage(beverage));
        assertEquals("Drink slow this is hot", hotBeverage.drinkSlowly());

    }

    @Test
    public void shouldNotSpillDrink() {
        Beverage beverage = new ColdBeverage();
        ColdBeverage coldBeverage = (ColdBeverage) beverage;

        Person olwethu = new Person();
        assertEquals("drink a cold beverage", olwethu.drinkBeverage(beverage));
        assertEquals("Don't spill your cold drink!", coldBeverage.doNotSpill());

    }

    @Test
    public void shouldBeAbleToDrinkFruitJuice() {

        Beverage beverage = new FruitJuice();
        ColdBeverage coldBeverage = (ColdBeverage) beverage;

        System.out.println(beverage instanceof Beverage);

        if(beverage instanceof HotBeverage){
            HotBeverage hb = (HotBeverage)beverage;
        }

        if(beverage instanceof ColdBeverage) {
            ColdBeverage cb = (ColdBeverage)beverage;
        }

        if(beverage instanceof FruitJuice) {
            FruitJuice fj = (FruitJuice)beverage;
        }

        Person olwethu = new Person();
        assertEquals("Drinking a Fruit Juice so : Don't spill fruit juice is too precious.", olwethu.drinkBeverage(beverage));
        assertEquals("Don't spill fruit juice is too precious.", coldBeverage.doNotSpill());

    }


    @Test
    void shouldBeAbleToCoolBeverageUsingFridgeCoolDownWithMethod(){
        Beverage beverage = new ColdBeverage();
        ColdBeverage bevvy = (ColdBeverage) beverage;
        Fridge bosch = new Fridge(bevvy);
        bosch.coolDownWith(10);
        assertEquals(-26,bevvy.getTemperature());
    }
    @Test
    void shouldBeAbleToCoolBeverageUsingFridgeCoolForMinutesMethod(){
        Beverage beverage = new ColdBeverage();
        ColdBeverage bevvy = (ColdBeverage) beverage;
        Fridge bosch = new Fridge(bevvy);
        bosch.coolForMinutes();
        assertEquals(-19,bevvy.getTemperature());
    }
    @Test
    void shouldBeAbleToCoolBeverageUsingFridgeCoolForHoursMethod(){
        Beverage beverage = new ColdBeverage();
        ColdBeverage bevvy = (ColdBeverage) beverage;
        Fridge bosch = new Fridge(bevvy);
        bosch.coolForHours();
        assertEquals(-26,bevvy.getTemperature());
    }
    @Test
    void shouldBeAbleToCoolBeverageUsingFridgeCoolForDaysMethod(){
        Beverage beverage = new ColdBeverage();
        ColdBeverage bevvy = (ColdBeverage) beverage;
        Fridge bosch = new Fridge(bevvy);
        bosch.coolForDays();
        assertEquals(-36,bevvy.getTemperature());
    }

    @Test
    void shouldBeAbleToHeatBeverageUsingMicrowaveHeatUpToMethod(){
        Beverage beverage = new HotBeverage();
        HotBeverage coffee = (HotBeverage) beverage;
        Microwave samsung = new Microwave(coffee);
        samsung.heatUpTo(100);
        assertEquals(100,coffee.getTemperature());
    }

    @Test
    void shouldBeAbleToHeatBeverageUsingMicrowaveLowMethod(){
        Beverage beverage = new HotBeverage();
        HotBeverage coffee = (HotBeverage) beverage;
        Microwave samsung = new Microwave(coffee);
        samsung.low();
        assertEquals(90,coffee.getTemperature());
    }

    @Test
    void shouldBeAbleToHeatBeverageUsingMicrowaveMediumMethod(){
        Beverage beverage = new HotBeverage();
        HotBeverage coffee = (HotBeverage) beverage;
        Microwave samsung = new Microwave(coffee);
        samsung.medium();
        assertEquals(120,coffee.getTemperature());
    }

    @Test
    void shouldBeAbleToHeatBeverageUsingMicrowaveHighMethod(){

        Beverage beverage = new HotBeverage();
        HotBeverage coffee = (HotBeverage) beverage;

        Microwave samsung = new Microwave(coffee);
        samsung.high();

        assertEquals(150,coffee.getTemperature());
    }

    @Test
    void currentTemperature(){

        Beverage beverage = new HotBeverage();
        HotBeverage coffee = (HotBeverage) beverage;

        Microwave samsung = new Microwave(coffee);
        samsung.high();

        assertEquals(150,coffee.getTemperature());
    }
}


package sortChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {
    @Test
    public void testThatAirConditionIsOff () {
        AirCondition airCondition = new AirCondition();
        assertTrue(airCondition.isOff());
    }

    @Test
    public void testThatAirConditionIsOffAndICanTurnItOn () {
        AirCondition airCondition = new AirCondition();
        assertTrue(airCondition.isOff());
        airCondition.isOn();
        assertFalse(airCondition.isOff());
    }

    @Test
    public void testThatAirConditionCanIncreaseTemperature(){
        AirCondition airCondition = new AirCondition();
        airCondition.isOn();
        int defaultTemperature =16;
        airCondition.tempIncreases(defaultTemperature);
        int result = 17;
        assertEquals(result, airCondition.tempIncreases(defaultTemperature));
    }

    @Test
    public void testThatAirConditionCanDecreseInTemperature(){
        AirCondition airCondition = new AirCondition();
        airCondition.isOn();
        int defaultTemperature =16;
        airCondition.tempIncreases(defaultTemperature);
        int normalTemperature = 25;
        airCondition.tempDecreases(normalTemperature);
        int  newTemp= 24;
        assertEquals(newTemp, airCondition.tempDecreases(normalTemperature));
    }


    //DESIGN IS BEAUTY
}
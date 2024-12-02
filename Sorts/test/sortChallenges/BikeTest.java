package sortChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    Bike bike = new Bike();
    @Test
    public void testThatBikeIsOff(){ 

        bike.isOff();

        assertTrue(bike.isOff());
    }

    @Test
    public void testThatBikeIsOffAndCanTurnOn(){
        bike.isOff();
        bike.isOn();
        assertFalse(bike.isOn());
    }

    @Test
    public void testThatBikeCanAccelerate(){
        bike.isOn();

        bike.canAccelerateToGearOne();
        int expected = 18;
        assertEquals(bike.canAccelerateToGearOne(), expected);
    }

    @Test
    public void testThatBikeCanAccelerateAgain(){
        bike.isOn();
        bike.canAccelerateToGearTwo();

        int expected = 26;
        assertEquals(bike.canAccelerateToGearTwo(), expected);
   }

   @Test
    public void testThatBikeCanAccelerateToGearThree(){
        bike.isOn();
        bike.canAccelerateToGearThree();

        int expected = 36;
        assertEquals(bike.canAccelerateToGearThree(), expected);
   }

   @Test
    public void testThatBikeCanAccelerateToGearFour(){
        bike.isOn();
        bike.canAccelerateToGearFour();

        int expected = 48;
        assertEquals(bike.canAccelerateToGearFour(), expected);
   }

   @Test
    public void testThatBikeCanDecelerate(){
       bike.isOn();

       bike.canDecelerateToGearOne();
       int expected = 16;
       assertEquals(bike.canDecelerateToGearOne(), expected);
   }

    @Test
    public void testThatBikeCanDecelerateAgain(){
        bike.isOn();
        bike.canDecelerateToGearTwo();

        int expected = 22;
        assertEquals(bike.canDecelerateToGearTwo(), expected);
    }

    @Test
    public void testThatBikeCanDecelerateToGearThree(){
        bike.isOn();
        bike.canDecelerateToGearThree();

        int expected = 30;
        assertEquals(bike.canDecelerateToGearThree(), expected);
    }

    @Test
    public void testThatBikeCanDecelerateToGearFour(){
        bike.isOn();
        bike.canDecelerateToGearFour();

        int expected = 40;
        assertEquals(bike.canDecelerateToGearFour(), expected);
    }

}

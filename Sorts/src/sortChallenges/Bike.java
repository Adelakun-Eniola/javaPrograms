package sortChallenges;

public class Bike {

    private int speed;
    private int gearOne;
    private boolean isOff = true;


    public boolean isOff() {
        return true;
    }


    public boolean isOn() {
        return !this.isOff;
    }

    public int canAccelerateToGearOne() {
        speed = 17;
        if(speed > 0 && speed <=20)
            speed+=1;
        return speed;
    }

    public int canAccelerateToGearTwo() {
        speed = 24;
        if (speed >=21 && speed <=30)
            speed+=2;
        return speed;
    }

    public int canAccelerateToGearThree() {
        speed = 33;
        if (speed >= 31 && speed <=40)
            speed+=3;
        return speed;
    }

    public int canAccelerateToGearFour() {
        speed = 44;
        if (speed > 40)
            speed+=4;
        return speed;
    }


    public int  canDecelerateToGearOne() {
        speed = 17;
        if(speed > 0 && speed <=20)
            speed-=1;
        return speed;
    }

    public int canDecelerateToGearTwo() {
        speed = 24;
        if (speed >=21 && speed <=30)
            speed-=2;
        return speed;
    }

    public int canDecelerateToGearThree() {
        speed = 33;
        if (speed >= 31 && speed <=40)
            speed-=3;
        return speed;
    }

    public int canDecelerateToGearFour() {
        speed = 44;
        if (speed > 40)
            speed-=4;
        return speed;
    }
}

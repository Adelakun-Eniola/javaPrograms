package sortChallenges;

public class AirCondition {
    private boolean isOff = true;
//    final int defaultTemperature= 16;
    public int defaultTemperature =16;
    public int normalTemperature = 25;
    public int maxTemperature = 30;
    public boolean isOff() {
        return isOff;
    }

    public boolean isOn() {
        return this.isOff = false;
    }


    public int tempIncreases(int defaultTemperature) {
        int increment = 1;
        int increasedTemp = increment+ defaultTemperature;
        return increasedTemp;
    }

    public int tempDecreases(int normalTemperature) {
        if(normalTemperature <= 16){
            return 16;
        }

        int decrement = 1;
        int decreasedTemp = normalTemperature-decrement;

        return decreasedTemp;

    }
}

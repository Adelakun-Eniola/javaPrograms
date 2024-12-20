public class Charges {

    private int hoursEntered;
    private static  int PERTHREEHOURS;
    private static double mainOps(int hoursEntered, int perThreeHours) {
         hoursEntered = 13;
         perThreeHours = 3;
        int noOfHours = hoursEntered/perThreeHours;
        return noOfHours;
    }

    public static double calculateCharges(int hoursEntered) {
        double totalPrice = mainOps(hoursEntered, PERTHREEHOURS) * 2;
        return totalPrice;
    }


    public static double checkForOddHours(int numberOfHours) {
        int remainingTimeUsed = 13%3;
        double priceForRemainingTimeUsed = remainingTimeUsed * 0.5;
        double totalTime = mainOps(numberOfHours, PERTHREEHOURS) * 2 + priceForRemainingTimeUsed;
        return totalTime;
    }
}

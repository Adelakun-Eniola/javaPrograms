package Structures;

public class DayOne {
    int [] array = {2,7,11,15};
    int target = 9;

    public static int[] returnIndex(int[] array, int target) {
        for (int index = 0; index < array.length; index++) {
            for (int outdex = index+1; outdex < array.length; outdex++) {;
                if (array[index] + array[outdex] == target){
                    return new int[]{index, outdex};
                }
            }
        }
        return null;
    }
}
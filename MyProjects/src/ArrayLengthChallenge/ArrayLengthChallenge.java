package ArrayLengthChallenge;

public class ArrayLengthChallenge {
    int [] arrays = {4,5,8};
    //int length = arrays.length;
    int[] newLength = new int [arrays.length*2];

    public static int[] multiplyElements(int[] arrays) {
        for (int index = 0; index < arrays.length; index++) {
            int product = arrays[index] *=2;
        }
        return arrays;
    }

    public static int[] newArray(int[] arrays, int [] newLength) {
        for(int index = 0; index < arrays.length; index++){
          newLength[index] = arrays[index];
          newLength[index + arrays.length] = arrays[index] *=2;
        }
        return newLength;
    }


}

package ArrayList;

public class Xercise2 {
    public static void main(String[] args) {

            setTenElementsToZero();;
    }
    public static void setTenElementsToZero(){
        int [] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        for (int i = 10; i < array.length; i++) {
            array[i] = 0;
            System.out.print(array[i]);
        }

    }
}

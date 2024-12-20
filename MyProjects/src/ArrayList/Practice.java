package ArrayList;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        lists.add("Blessed");
        lists.add("Anointed");

        System.out.println(lists);

        ArrayList<Integer> integer =  new ArrayList<>();
        integer.remove(1);
        System.out.println(integer);
    }
}

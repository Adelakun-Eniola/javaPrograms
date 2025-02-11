package data.repositories;

import data.model.Item;

import java.util.ArrayList;

public class Items {

    ArrayList <Item> items = new ArrayList<>();

    public  void save(Item item){
        items.add(item);
    }


//    public static void deleteAllById(int i) {
//
//    }

    public static int count() {
        return 0;
    }
}
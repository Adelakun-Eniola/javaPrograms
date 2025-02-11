package data.repositories;

import data.model.Item;
import org.junit.Test;

import java.util.ArrayList;

import static data.repositories.Items.*;
import static org.junit.jupiter.api.Assertions.*;

public class ItemsTest {
    Items items = new Items();


        @Test
        public void saveItems() {

            Item item = new Item("TestItem");

            
            Items.save(item);

            
            ArrayList<Item> items = manager.getItems();

            assertEquals(1, items.size(), "The list should contain 1 item after saving.");
           
        }


    }

}

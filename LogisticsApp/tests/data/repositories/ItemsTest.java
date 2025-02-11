package data.repositories;

import data.model.Item;
import org.junit.Test;

import java.util.ArrayList;

import static data.repositories.Items.*;
import static org.junit.jupiter.api.Assertions.*;

public class ItemsTest {
    Items items = new Items();


<<<<<<< HEAD
    @Test
    public void saveItems() {
        Item item = new Item("TestItem", "nothing", 4000);
        Item saved = items.save(item);
        long noOfItem = items.count();
        assertEquals(1, noOfItem);
    }

    @Test
    public void findbyID(){
        
    }


}
=======
        @Test
        public void saveItems() {

            Item item = new Item("TestItem");

            
            Items.save(item);

            
            ArrayList<Item> items = manager.getItems();

            assertEquals(1, items.size(), "The list should contain 1 item after saving.");
           
        }


    }

}
>>>>>>> acad4e47e9c8249ea511c2705e5ec241a6cae0e1

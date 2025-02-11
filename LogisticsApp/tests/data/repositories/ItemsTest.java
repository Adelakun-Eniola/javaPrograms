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

            // Save the item
            Items.save(item);

            // Retrieve the list of items
            ArrayList<Item> items = manager.getItems();

            // Verify that the item was added to the list
            assertEquals(1, items.size(), "The list should contain 1 item after saving.");
            assertEquals("TestItem", items.get(0).getName(), "The saved item should have the name 'TestItem'.");
        }


    }

}
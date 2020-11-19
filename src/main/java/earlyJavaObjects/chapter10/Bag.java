package earlyJavaObjects.chapter10;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    List<Item> list = new ArrayList<Item>();

    public void add(String itemName) {
        Item item = new Item(itemName);
        list.add(item);
    }

    public int count(String itemName) {
        int count = 0;

        while (!list.isEmpty()) {
            if (list.contains(itemName)) {
                count = count + 1;
            }
        }
        return count;
    }

    class Item {
        String itemName;
        int quantity;

        public Item(String itemName) {
            this.itemName = itemName;
        }
    }

}

package Classes;

import java.awt.*;

public class Warehouse {
    private List inventory;
    private Integer capacity;
    private Item item;
    private Integer value;

    public Warehouse(Item item,Integer capacity) {
        this.item = item;
        this.capacity = capacity;
    }
    public Item getItem() {
        return item;
    }

}

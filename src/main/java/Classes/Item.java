package Classes;

import java.util.ArrayList;
import java.util.UUID;

public class Item {
    private final String name;
    private final String id;
    private final Integer barcode;
    private static final ArrayList<Item> itemList = new ArrayList<>();
    //private ArrayList<Optional<Item>> items;
    public Item(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.barcode = (int) (Math.random() * 1000000000);
        itemList.add(this);
        }
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Integer getBarcode() {
        return barcode;
    }

    public static ArrayList<Item> getItemList() {
        return itemList;
    }

}




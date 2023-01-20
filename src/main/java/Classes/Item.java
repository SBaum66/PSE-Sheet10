package Classes;

import java.util.ArrayList;
import java.util.UUID;

public class Item {
    private final String name;
    private final String id;
    private final Integer barcode;
    private static final ArrayList<Item> itemList = new ArrayList<>();
    public enum type {
        Kugelschreiber,
        Geodreieck,
        Zirkel;
    }
    private type itemType;

    public Item(String name, type itemType) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.barcode = (int) (Math.random() * 10000000);
        itemList.add(this);
        this.itemType = itemType;

        }
    public String getName() {
        return name;
    }
    public type getType() {
        return itemType;
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
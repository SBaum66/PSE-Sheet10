package baum.aydin.elkhouly;

import java.util.ArrayList;
import java.util.UUID;

public class Item {
    private final String name;
    private final String id;
    private final Integer barcode;
    private static final ArrayList<Item> itemList = new ArrayList<>();
    public enum ItemType {
        Kugelschreiber,
        Geodreieck,
        Zirkel;
    }
    private ItemType type;

    public Item(String name, ItemType type) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.barcode = (int) (Math.random() * 10000000);
        itemList.add(this);
        this.type = type;

        }
    public String getName() {
        return name;
    }
    public ItemType getType() {
        return type;
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
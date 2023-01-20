package baum.aydin.elkhouly;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.UUID;

//This class is used to create an item object
public class Item {
    private final String name;
    private final String id;
    private final Integer barcode;
    private static final ArrayList<Item> itemList = new ArrayList<>();
    public enum ItemType {Kugelschreiber,Geodreieck,Zirkel}
    private ItemType type;
    private static ArrayList<Integer> barcodeList;

//Constructor to create new Item object with random id and barcode
    public Item(String name, ItemType type) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.barcode = (int) (Math.random() * 10000000);
        itemList.add(this);
        this.type = type;
        barcodeList.add(this.barcode);
        }
    //get Name, Type, Is and Barcode of an Item
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
    //get a List of all Items
    public static ArrayList<Item> getItemList() {
        return itemList;
    }
    public static ArrayList<Integer> getBarcodeList() {return barcodeList;}

}
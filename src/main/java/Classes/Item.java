package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class Item {
    private String name;
    private String id;
    private Integer barcode;
    //private ArrayList<Optional<Item>> items;
    public Item(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.barcode = (int) (Math.random() * 1000000000);
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

}




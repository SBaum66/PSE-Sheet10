package Classes;

import java.util.UUID;

public class Item {
    private String name;
    private String id;
    private Integer barcode;

    public Item(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
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




package Classes;

import java.util.ArrayList;

public class ItemIdentification {
    private Integer barcode;

    public ItemIdentification(Integer barcode) {
        this.barcode = barcode;
        //this.item = lookupItem(barcode);
    }

    static public Item lookupItem(Integer barcode) throws ItemNotFoundException {
        for (Item item : Item.getItemList()) {
            if (item.getBarcode().equals(barcode)) {
                return item;
            }
        }
        // If item is not found, throw an exception
        throw new ItemNotFoundException("Item not found for barcode: " + barcode);
    }

}
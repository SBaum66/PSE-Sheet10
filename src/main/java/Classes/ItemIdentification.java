package Classes;

import java.util.ArrayList;

public class ItemIdentification {
    private Integer barcode;

    public ItemIdentification(Integer barcode) {
        this.barcode = barcode;
        //this.item = lookupItem(barcode);
    }

    static public Item lookupItem(Integer barcode) throws ItemNotFoundException {
        //Looks through all items in the itemList and returns the item with the same barcode
        for (Item item : Item.getItemList()) {
            if (item.getBarcode().equals(barcode)) {
                String r = item.toString() + item.getName() + item.getId();
                System.out.print(r);
                return item;
            }
        }
        // If item is not found, throw an exception
        throw new ItemNotFoundException("Item not found for barcode: " + barcode);
    }

}
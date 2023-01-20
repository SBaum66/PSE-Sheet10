package baum.aydin.elkhouly;

import java.util.ArrayList;
import java.util.Optional;

//This class is used to identify an item by its barcode
public class ItemIdentification {
    private Integer barcode;
    private static ArrayList<Optional<Item>> identified;

    public ItemIdentification(Integer barcode) {
        this.barcode = barcode;
        this.identified = new ArrayList<Optional<Item>>();

    }
    //Compares a barcode to every Item.getBarcode() and returns the Item if it matches
    public Item lookupItem(Integer barcode) throws ItemNotFoundException {
        for (Item item : Item.getItemList()) {
            if (item.getBarcode().equals(barcode)) {
                identified.add(Optional.of(item));
                return item;
            }
        }
        // If item is not found, throw an exception
        throw new ItemNotFoundException("Item not found for barcode: " + barcode);
    }
    //returns a List of every identified Item
    public ArrayList<Optional<Item>> getIdentified() {
        return identified;
    }

}
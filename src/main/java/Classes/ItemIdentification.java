package Classes;

public class ItemIdentification {
    private Item item;
    private String barcode;

    public ItemIdentification(String barcode) {
        this.barcode = barcode;
        //this.item = lookupItem(barcode);
    }

    public Item getItem() {
        return item;
    }

    public String getBarcode() {
        return barcode;
    }

    private Item lookupItem(String barcode) throws ItemNotFoundException {

        for (Item item : item) {
            if (item.getBarcode().equals(barcode)) {
                return item;
            }
        }
        // If item is not found, throw an exception
        throw new ItemNotFoundException("Item not found for barcode: " + barcode);
    }


}
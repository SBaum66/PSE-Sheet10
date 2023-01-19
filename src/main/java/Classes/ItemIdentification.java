package Classes;
class ItemIdentification
{
    private String itemName;
    private String itemId;

    public ItemIdentification(String itemName, String itemId) {
        this.itemName = itemName;
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemId() {
        return itemId;
    }

    public Item identification(Integer barcode) throws ItemNotFoundException {
        for(Item item : Item.getItemList()) {
            if(item.getBarcode() == barcode) {
                return item;
            }
        } throw new ItemNotFoundException("Item not found Barcode: " + barcode);
    }
}

package Classes;
import Classes.Item.type;

public class Company

{
    private String name;
    private Item item;
    private Warehouse kugelschreiberWarehouse;
    private Warehouse geodreieckWarehouse;
    private Warehouse zirkelWarehouse;

//Constructor for Company, creates new Warehouse for each Item Type and sorts Items into their respective Warehouse
    public Company(String name) {
        this.name = name;
        Warehouse kugelschreiberWarehouse = new Warehouse(30);
        Warehouse geodreieckWarehouse = new Warehouse(20);
        Warehouse zirkelWarehouse = new Warehouse(10);
        for (int i = 0; i < Item.getItemList().size(); i++) {
            for (Item item : Item.getItemList()
            ) {
                if (item.getType() == type.Kugelschreiber) {
                    kugelschreiberWarehouse.addItem(item);
                } else if (item.getType() == type.Geodreieck) {
                    geodreieckWarehouse.addItem(item);
                } else zirkelWarehouse.addItem(item);
            }
        }
    }
        public void handleIncomingItem(Item item) {
                if (item.getType() == type.Kugelschreiber) {
                    this.kugelschreiberWarehouse.addItem(item);
                } else if (item.getType() == type.Geodreieck) {
                    this.geodreieckWarehouse.addItem(item);
                } else if(item.getType() == type.Zirkel) {
                    zirkelWarehouse.addItem(item);
                }
        }

}
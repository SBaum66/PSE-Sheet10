package baum.aydin.elkhouly;
import baum.aydin.elkhouly.Item.ItemType;
//thic class represents the Company that is using this Software and creates a Warehouse for each Item Type
public class Company{
    private String name;
    private Item item;
    private final Warehouse kugelschreiberWarehouse;
    private  final Warehouse geodreieckWarehouse;
    private final Warehouse zirkelWarehouse;

//Constructor for Company, creates new Warehouse for each Item Type
    public Company(String name) {
        this.name = name;
        this.kugelschreiberWarehouse = new Warehouse(30);
        this.geodreieckWarehouse = new Warehouse(20);
        this.zirkelWarehouse = new Warehouse(10);

    }
    //Getter Methods for each Warehouse of the Company
    public Warehouse getKugelschreiberWarehouse() {
        return kugelschreiberWarehouse;
    }
    public Warehouse getGeodreieckWarehouse() {
        return geodreieckWarehouse;
    }
    public Warehouse getZirkelWarehouse() {
        return zirkelWarehouse;
    }

    //Method that sorts Items into their respective Warehouse
    public void handleIncomingItem(Item item) {
                if (item.getType() == ItemType.Kugelschreiber) {
                    this.kugelschreiberWarehouse.addItem(item);
                } else if (item.getType() == ItemType.Geodreieck) {
                    this.geodreieckWarehouse.addItem(item);
                } else if(item.getType() == ItemType.Zirkel) {
                    zirkelWarehouse.addItem(item);
                }
        }
       // public processIncomingOrder(ItemIdentification identification, Customer customer);

}
package baum.aydin.elkhouly;
import baum.aydin.elkhouly.Item.ItemType;
import java.lang.System.*;
import java.util.UUID;

public class Main {
  public static void main(String[] args) {
    Item item1 = new Item("Kugelschreiber", ItemType.Kugelschreiber);
    Company PSE = new Company("PSE");
    Item item2 =new Item("Geodreieck", ItemType.Geodreieck);
    Warehouse kugelschreiberWarehouse = PSE.getKugelschreiberWarehouse();
    kugelschreiberWarehouse.addItem(item1);
    Buffer b = new Buffer();
    b.addItem(item1);
    System.out.println(kugelschreiberWarehouse.getInventory());
    System.out.print(b.getList());
    b.addItem(item2);
    b.removeItem();
    System.out.print(b.getList());
    System.out.print(UUID.randomUUID().toString());
  }

}
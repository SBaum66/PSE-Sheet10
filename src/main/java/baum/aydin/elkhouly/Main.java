package baum.aydin.elkhouly;
import baum.aydin.elkhouly.Item.ItemType;
import java.lang.System.*;
public class Main {
  public static void main(String[] args) {
    Item item1 = new Item("Kugelschreiber", ItemType.Kugelschreiber);
    Company PSE = new Company("PSE");
    Warehouse kugelschreiberWarehouse = PSE.getKugelschreiberWarehouse();
    kugelschreiberWarehouse.addItem(item1);
    System.out.println(kugelschreiberWarehouse.getInventory());
  }

}
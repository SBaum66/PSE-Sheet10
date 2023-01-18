package baum.aydin.elkhouly;
import Classes.Item;
import Classes.ItemIdentification;
import Classes.Warehouse;

public class Main {
    public static void main(String[] args) {
        Warehouse amazon = new Warehouse(9);
        Item stift = new Item("stift");
        amazon.addItem(stift);
        String i = amazon.getinventory().toString();
        System.out.println(i);
    }
}
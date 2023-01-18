package baum.aydin.elkhouly;
import Classes.Item;
import Classes.ItemIdentification;
import Classes.Warehouse;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Warehouse amazon = new Warehouse(9);
        Item stift = new Item("stift");
        amazon.addItem(stift);
        ArrayList<Optional<Item>> items = new ArrayList<Optional<Item>>();

        String i = amazon.getinventory().toString();
        System.out.println(items);
        System.out.println(UUID.randomUUID());
    }
}
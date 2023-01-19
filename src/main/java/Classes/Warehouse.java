package Classes;
import java.util.ArrayList;
import java.util.Optional;

public class Warehouse {
    private Integer capacity;
    private final ArrayList<Optional<Item>> inventory;
    private ArrayList<Optional<String>> itemid;


    public Warehouse(Integer capacity) {
        this.capacity = capacity;
        this.inventory = new ArrayList<Optional<Item>>();
        this.itemid = new ArrayList<Optional<String>>();
        for (int i = 0; i < capacity; i++) {
            itemid.add(Optional.empty());
            inventory.add(Optional.empty());
        }

    }

    public Integer getCapacity() {
        return capacity;
    }

    public ArrayList<Optional<Item>> getInventory() {
        return inventory;
    }

    public void addItem(Item item) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).isEmpty()) {
                inventory.set(i, Optional.of(item));
                itemid.set(i, Optional.of(item.getId()));
                break;
            }
        }
    }

    public Integer getCompartmentNuberOf(ItemIdentification identification) {
        Integer Dingensens = 69;
        Integer Dingsbums = Dingensens*2;
        return(Dingsbums);
    }

    public Optional<Item> removeItem(int compartmentNumber) {
        if (compartmentNumber < 0 || compartmentNumber >= inventory.size() || !inventory.get(compartmentNumber).isPresent()) {
            return Optional.empty();
        }
        Optional<Item> removedItem = inventory.get(compartmentNumber);
        inventory.set(compartmentNumber, Optional.empty());
        itemid.set(compartmentNumber, Optional.empty());
        return removedItem;
    }
    public Optional getItem(Integer compartmentNumber) {
        return inventory.get(compartmentNumber);
    }
}

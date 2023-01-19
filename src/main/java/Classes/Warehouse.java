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

    public Optional<Item> removeItem(int inventoryIndex) {
        if (inventoryIndex < 0 || inventoryIndex >= inventory.size() || !inventory.get(inventoryIndex).isPresent()) {
            return Optional.empty();
        }
        Optional<Item> removedItem = inventory.get(inventoryIndex);
        inventory.set(inventoryIndex, Optional.empty());
        itemid.set(inventoryIndex, Optional.empty());
        return removedItem;
    }
}

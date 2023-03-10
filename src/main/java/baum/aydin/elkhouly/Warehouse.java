package baum.aydin.elkhouly;
import java.util.ArrayList;
import java.util.Optional;

public class Warehouse {
    static private Integer capacity;
    private final ArrayList<Optional<Item>> inventory;

    public Warehouse(int capacity) {
        this.capacity = capacity;
        inventory = new ArrayList<Optional<Item>>();
        for (int i = 0; i < capacity; i++) {
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
        /*
        loopinvariant i
        */
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).isEmpty()) {
                inventory.set(i, Optional.of(item));
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
        return removedItem;
    }
    public Optional<Integer> getCompartmentNumberOf(ItemIdentification identification) throws ItemNotFoundException {
        for(int i=0;i<identification.getIdentified().size();i++ ) {
            Item item = identification.getIdentified().get(i).get();
            if (inventory.contains(item)) {
                return Optional.of(inventory.indexOf(item));
            }
        }
        throw new ItemNotFoundException("Item is not in Inventory");
    }


}

package baum.aydin.elkhouly;
import javax.management.Query;
import java.util.Hashtable;
import java.util.LinkedList;

//Handels Items that are about to leave the Warehouse and enters the packing station
public class Buffer {
    private Item item;
    private final LinkedList<Item> buffer;


    public Buffer() {
        this.buffer = new LinkedList<Item>();

    }
    public void addItem(Item item) {
        buffer.add(item);
    }

    public void removeItem(){
        buffer.removeFirst();
    }

    public LinkedList getList(){
        return buffer;
    }
    public Boolean isEmpty(){
        Boolean b;
            if(buffer.isEmpty()){
                b = true;
            } else {
                b = false;
            }
            return  b;
        }
    }

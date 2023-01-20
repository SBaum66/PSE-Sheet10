package baum.aydin.elkhouly;
import javax.management.Query;

//Handels Items that are about to leave the Warehouse and enters the packing station
public class Buffer {
    private Item item;
    private final Query buffer;


    public Buffer() {
        this.buffer = new Query();

    }
}

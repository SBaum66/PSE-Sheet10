package baum.aydin.elkhouly;
import Classes.Item;
import static Classes.Item.type.*;
import Classes.ItemIdentification;
import Classes.ItemNotFoundException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ItemNotFoundException {
        //create list with 100 random numbers
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            randomNumbers.add((int) (Math.random() * 10000000));
        }
        Item Stift = new Item("Stift", Kugelschreiber);
        ItemIdentification lol = new ItemIdentification(randomNumbers.get(0));
        for(int i = 0; i < randomNumbers.size(); i++) {
            try {
                lol.lookupItem(randomNumbers.get(i));
            } catch (ItemNotFoundException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(i);

        }
    }
}
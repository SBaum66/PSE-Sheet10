package baum.aydin.elkhouly;

import Classes.ItemIdentification;
import Classes.ItemNotFoundException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ItemNotFoundException {
        //create list with 100 random numbers
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            randomNumbers.add((int) (Math.random() * 1000000000));
        }
        for(int i = 0; i < 100; i++) {
            try {
                ItemIdentification.lookupItem(randomNumbers.get(i));
            } catch (ItemNotFoundException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(i);

        }
    }
}
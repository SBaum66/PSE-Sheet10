package baum.aydin.elkhouly;
import Classes.Item;
import Classes.Warehouse;

public class Main {
    static Item geodreieck = new Item("geodreieck", 5);
    static Warehouse geoWH = new Warehouse(geodreieck,100);
    static String t = geoWH.getItem().getName();
    public static void main(String[] args) {
        System.out.println(t);
    }
}
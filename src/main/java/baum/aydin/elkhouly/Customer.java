package baum.aydin.elkhouly;

import java.util.ArrayList;
import java.util.UUID;

//Objects of this class represent a Customer
public class Customer {
    private static ArrayList<Customer> customerList = new ArrayList<Customer>();
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String id;

    public Customer(String name, String address, String email, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.id = UUID.randomUUID().toString();
        customerList.add(this);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getId() {
        return id;
    }
}

package com.TheIronYard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {
        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("123 Main St.", "Austin", "TX", "78787"));
        addresses.add(new Address("43 High St.", "Columbus", "OH", "43034"));
        addresses.add(new Address("678 Leon Rd.", "Tallahassee", "FL", "32307"));
        addresses.add(new Address("8 Deep Sea Way", "Boca Raton", "FL", "33433"));

        System.out.println("Before sorting");
        print(addresses);

        Collections.sort(addresses, new Comparator<Address>() {
                    @Override
                    public int compare(Address a1, Address a2) {
                        return a1.getState().compareTo(a2.getState());
                    }
                });

        System.out.println("\nAfter sorting by state");
        print(addresses);

        Collections.sort(addresses, (a1, a2) -> a1.getCity().compareTo(a2.getCity()));

        System.out.println("\nAfter sorting by city");
        print(addresses);
    }

    private static void print(List<Address> addresses) {
        for(Address address : addresses) {
            System.out.println(address);
        }
    }
}

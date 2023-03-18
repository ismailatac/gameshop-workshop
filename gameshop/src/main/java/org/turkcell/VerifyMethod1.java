package org.turkcell;

import java.util.ArrayList;

public class VerifyMethod1 implements VerifyCustomer {

    private static ArrayList<Customer> verifyList = new ArrayList();

    static {
        verifyList.add(new Customer(1, "11648965214", "Merve", "Demir", 1997));
        verifyList.add(new Customer(2, "56897456321", "Osman", "Şahin", 1998));
        verifyList.add(new Customer(3, "24687469985", "Ahmet", "Öztürk", 1991));
        verifyList.add(new Customer(4, "68974563215", "Taner", "Keskin", 1992));
        verifyList.add(new Customer(5, "56841235678", "Pınar", "Karaca", 1988));
    }


    public boolean verify(Customer customer) {
        for (Customer c : verifyList) {

            if (c.getIdentityNumber() == customer.getIdentityNumber()) {
                System.out.println("Method 1 ile Kişi doğrulandı");
                return true;
            }

        }
        System.out.println("Method 1 ile kişi doğrulanamadı");
        return false;
        }
    }

package org.turkcell;

import java.util.ArrayList;

public class CustomerManager {

    private VerifyCustomer verifyCustomer;

    public CustomerManager(VerifyCustomer verifyCustomer) {
        this.verifyCustomer = verifyCustomer;
    }

    public ArrayList<Customer> customers = new ArrayList();
    public void addCustomer(Customer customer) {
        boolean verifyResult = verifyCustomer.verify(customer);
        if (verifyResult){
            customers.add(customer);
            System.out.println("Kişi eklendi");
        }
        else
            System.out.println("Kayıt yapılamadı.");



    }
    public void deleteCustomer(int id) {
        customers.remove(id);
        System.out.println("silindi");
    }
    public void updateCustomer(int id, Customer customer) {
        for (Customer customer1 : customers){
            if (customer1 == customer){
                Customer cs = customer1;
                this.deleteCustomer(id);
                cs.setId(id);
                cs.setOwnGames(customer.getOwnGames());
                cs.setBirthYear(customer.getBirthYear());
                cs.setFirstName(customer.getFirstName());
                cs.setLastName(customer.getLastName());
                cs.setIdentityNumber(customer.getIdentityNumber());

                customers.add(cs);

            }
        }
        System.out.println("güncellendi");

    }
    public ArrayList<Customer> getAllCustomers(){
        return customers;
    }


}

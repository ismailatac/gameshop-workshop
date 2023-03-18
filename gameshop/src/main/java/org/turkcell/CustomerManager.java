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
            System.out.println(customer.getFirstName()+" "+customer.getLastName()+" kişisi eklendi");
        }
        else
            System.out.println("Kayıt yapılamadı.");



    }
    public void deleteCustomer(int id) {
        customers.remove(id);
        System.out.println(id+" numaralı kişi silindi");
    }
    public void updateCustomer(int id, Customer customer) {
        for (Customer customer1 : customers){
            if (customer1.getId() == id){

                Customer cs = customer1;

                cs.setId(customer.getId());
                cs.setOwnGames(customer.getOwnGames());
                cs.setBirthYear(customer.getBirthYear());
                cs.setFirstName(customer.getFirstName());
                cs.setLastName(customer.getLastName());
                cs.setIdentityNumber(customer.getIdentityNumber());
                //this.deleteCustomer();
                //customers.add(cs);
                System.out.println(id+ " numaralı kişi güncellendi");
                return;

            }

        }
        System.out.println("Güncellenecek kişi bulunamadı");


    }
    public ArrayList<Customer> getAllCustomers(){
        System.out.println("Bütün kişiler listelendi");
        return customers;
    }


}

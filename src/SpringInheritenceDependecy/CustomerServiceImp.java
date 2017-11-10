/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringInheritenceDependecy;

/**
 *
 * @author Jeevesh
 */

public class CustomerServiceImp implements CustomerService{
    
    private Customer customer;
    
    public CustomerServiceImp(Customer c){
        this.customer=c;
    }

    public CustomerServiceImp(){}
    @Override
        public Customer getCustomer() {

            return customer;
        }

    @Override
        public void displayDetails() {

            System.out.println("Customer details: "+customer.getCustId()+" "+customer.getCustName());
            System.out.println("Customer address: "+customer.getCustAddress().hno+", "+customer.getCustAddress().area+", "+customer.getCustAddress().city+", "+customer.getCustAddress().street);
        }
        
    @Override
        public void setCustomer(Customer c) {

            customer=c;
        }   
}

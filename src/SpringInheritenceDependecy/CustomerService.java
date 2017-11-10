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
public interface CustomerService {
    Customer getCustomer();
    void setCustomer(Customer c);
    void displayDetails();
}

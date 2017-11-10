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
public class Customer {
    Address custAddress;
    
    public Address getCustAddress(){
        return custAddress;
    }
    
    public void setCustAddress(Address custAddress){
        this.custAddress=custAddress;
    }
    
    public Customer(){
        custName="default";
        custId=0;
    }
    
    public Customer(String custName){
        this.custName=custName;
    }
    String custName;
    int custId;

    public String getCustName() {
        return custName;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }
}

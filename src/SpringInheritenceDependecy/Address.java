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
public class Address {
    
    String hno,street,area,city;
    
    public Address(){
        city="default";
    }
    
    public Address(String hno, String street, String area,String city){
        this.hno=hno;
        this.street=street;
        this.area=area;
        this.city=city;
    }

    public String getHno() {
        return hno;
    }

    public String getStreet() {
        return street;
    }

    public String getArea() {
        return area;
    }

    public String getCity() {
        return city;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

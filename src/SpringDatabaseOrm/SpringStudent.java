/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringDatabaseOrm;

/**
 *
 * @author Jeevesh
 */
public class SpringStudent {
    int id;
    String name;

    public SpringStudent(){
    
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringDemos;

/**
 *
 * @author Jeevesh
 */
public class MyServiceImp implements MyService{

    String message;

    public MyServiceImp() {
        this.message="Good Morning!";
    }

    public MyServiceImp(String message) {
        this.message = message;
    }
    
    @Override
    public void getMessage() {
        System.out.println(message);
    }

    @Override
    public void setMessage(String msg) {
        message=msg;
    }
    
}

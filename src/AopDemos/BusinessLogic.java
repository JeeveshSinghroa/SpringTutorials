/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AopDemos;

/**
 *
 * @author Jeevesh
 */
public class BusinessLogic implements IBusinessLogic{
    //foo() and bar() are two join points.
    @Override
    public void foo() {
        System.out.println("Inside BusinessLogic foo()");
    }

    @Override
    public void bar() throws Exception {
        System.out.println("Inside BusinessLogic bar()");
        throw new Exception();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AopDemos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Jeevesh
 */
public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/AopDemos/SpringConfig.xml");
        IBusinessLogic testObject = (IBusinessLogic) context.getBean("businesslogicbean");
        testObject.foo();
        try{
            testObject.bar();
        }catch(Exception e){
            System.out.println("Caught Business Logic exception");
        }
    }
}

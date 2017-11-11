/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringInheritenceDependecy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Jeevesh
 */
public class SpringDriver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/SpringInheritenceDependecy/SpringConfig.xml");
        CustomerServiceImp s = (CustomerServiceImp) context.getBean("service");
        s.displayDetails();
        System.out.println(s.getCustomer());
        s.displayDetails();
    }
}

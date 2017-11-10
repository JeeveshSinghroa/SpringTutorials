/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringDemos;
import SpringDemos.MyServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Jeevesh
 */
public class SpringDriver {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("/SpringDemos/SpringConfig.xml");
        MyServiceImp s = (MyServiceImp) context.getBean("service1");
        s.getMessage();
    }
}

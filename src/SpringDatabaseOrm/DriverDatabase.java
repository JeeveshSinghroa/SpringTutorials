/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringDatabaseOrm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Jeevesh
 */
public class DriverDatabase {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/SpringDatabaseOrm/beans.xml");
        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
        System.out.println("--------Records creation--------");
        SpringStudent s = (SpringStudent) context.getBean("springstudent");
        s.setId(2);
        s.setName("Roger");
        studentJDBCTemplate.create(s);
    }
}

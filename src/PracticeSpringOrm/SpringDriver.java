/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeSpringOrm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Jeevesh
 */
public class SpringDriver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/PracticeSpringOrm/springconfig.xml");
        SpringJDBCTemplate jdbctemplate = (SpringJDBCTemplate) context.getBean("springjdbctemplate");
        System.out.println("-------Record creation-------");
        SpringEmployee e = (SpringEmployee) context.getBean("springemployee");
        e.id=1;
        e.name="Chalmer";
        e.role="QA";
        jdbctemplate.create(e);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringHibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Jeevesh
 */
public class DriverHibernate {
    public static void main(String[] args) {
        try{
            ApplicationContext context = new ClassPathXmlApplicationContext("/SpringHibernate/springhibernate.xml");
            DriverHibernate driver = new DriverHibernate();
            User u = driver.buildUser();
            UserDAO dao = (UserDAO) context.getBean("daoTarget");
            if(dao!=null){
                User u1 = dao.saveUser(u);
                System.out.println("User Saved");
            }
            else
                System.out.println("Unable to save the user");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public User buildUser(){
        User user = new User();
        user.setFirstName("Jeevesh");
        user.setLastName("Singhroa");
        user.setAge(22);
        user.setEmail("jsinghroa@gmail.com");
        return user;
    }
}

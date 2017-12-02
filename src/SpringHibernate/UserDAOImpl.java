/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringHibernate;

import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 *
 * @author Jeevesh
 */
public class UserDAOImpl implements UserDAO{
    HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    
    @Override
    public User saveUser(User user) {
        try{
            hibernateTemplate.save(user);
            hibernateTemplate.flush();
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }
    
}

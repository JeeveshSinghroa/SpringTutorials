/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeSpringOrm;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Jeevesh
 */
public class SpringJDBCTemplate implements SpringDoa{
    private SpringEmployee s;
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource){
        this.dataSource=dataSource;
        this.jdbcTemplateObject= new JdbcTemplate(dataSource);
    }
    @Override
    public void create(SpringEmployee e) {
        int id = e.id;
        String role = e.role;
        String name = e.name;
        String sql = "insert into springemployee(id,name,role) values('"+id+"','"+name+"','"+role+"')";
        jdbcTemplateObject.execute(sql);
        System.out.println("-------Record inserted successfully-------");
    }
    
}

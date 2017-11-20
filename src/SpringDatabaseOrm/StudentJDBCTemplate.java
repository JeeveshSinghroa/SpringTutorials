/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringDatabaseOrm;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Jeevesh
 */
public class StudentJDBCTemplate implements StudentDAO{

    private SpringStudent s;
    private DataSource dataSource;                          //will contain url to datasource, uname, pwd.
    private JdbcTemplate jdbcTemplateObject;
    
    public void setDataSource(DataSource dataSource){
        this.dataSource=dataSource;
        this.jdbcTemplateObject=new JdbcTemplate(dataSource);
    }
    @Override
    public void create(SpringStudent s) {
        this.s = s;
        int id = s.getId();
        String name = s.getName();
        
        String sql = "insert into springstudent (id,name) values ("+
                "'"+id+"',"+"'"+name+"')";
        jdbcTemplateObject.execute(sql);
        System.out.println("Record successfully inserted.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AopDemos;

import java.lang.reflect.Method;
import org.springframework.aop.ThrowsAdvice;

/**
 *
 * @author Jeevesh
 */
public class LoggingThrowsAdvice implements ThrowsAdvice{
    public void afterThrowing(Method method, Object[] args, Object target, Throwable subclass){
        System.out.println("Logging that a " + subclass + "Exception was thrown");
    }
}

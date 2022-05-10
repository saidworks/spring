package com.perscholas.hibernate;

import com.perscholas.controller.findUser_Hql;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hibernate is starting!" );
        findUser_Hql u = new findUser_Hql();
//        u.getRecordbyId(5);
        u.getmaxSalary();
    }
}

package com.luv2code.controller;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.luv2code.models.Employee;

public class EmployeeController {
	SessionFactory factory = new Configuration().configure("hibernateEmp.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
	Session session = factory.openSession();
	
	public void createEmployeeTable() {
		Transaction t = session.beginTransaction();
		Employee e = new Employee();
		t.commit();
		System.out.println(e.getClass().getSimpleName()+" successfuly created");
		factory.close();
		session.close();
	}
	
	public void findEmployeeByname() {
		Transaction t = session.beginTransaction();
		TypedQuery query =  session.getNamedQuery("findEmployeeByName");
		query.setParameter("name","Tom Thele");
		List<Employee> employees = query.getResultList();
		Iterator<Employee> elements = employees.iterator();
		while(elements.hasNext()) {
			Employee current = elements.next();
			System.out.println(current);
		}
		factory.close();
		session.close();
	}
	
    public void findEmployeeById()
    {
    	//------------  Hibernate Named Query   ------------- 
        TypedQuery query = session.getNamedQuery("get_Emp_name_by_id");    
        query.setParameter("id",3);   
        List<Object[]> emName=  query.getResultList();
        for(Object[] o: emName){
        	System.out.println("Employee name: " +o[0] +" | Employee Salary: "+ o[1] +" | Emp Job Title: "+ o[2]);
            }
        factory.close();  
        session.close();    
    }

    public void ShowOfficeCodes_AsDepartment(){
    	//------------  Hibernate Named Query   ------------- 
    	TypedQuery query = session.getNamedQuery("empDepAlias");   
    	List<Object[]> list  =  query.getResultList();
    	for(Object[] e: list ){
    		System.out.println("OfficeCode: " + e[1] + " | Dep Name: " +e[3]+ " | Employee Name: " + e[2]);
    	}
    	factory.close();  
    	session.close(); 
    }         
}


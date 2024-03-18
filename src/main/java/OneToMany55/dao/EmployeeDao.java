package OneToMany55.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import OneToMany55.dto.Company;
import OneToMany55.dto.Employee;

public class EmployeeDao {
	
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager;		
	}
	//save
	public void saveEmployee(int companyId,Employee employee) {
		
		EntityManager entityManager=getEntityManager();
	Company dbCompany	=entityManager.find(Company.class, companyId);
	
	
	if(dbCompany != null) {
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		
		
		List<Employee> employees=dbCompany.getEmployee();
		
		
		employees.add(employee);
		dbCompany.setEmployee(employees);
		entityTransaction.commit();

	}else {
		System.out.println("Sorry that id is not present");
	}
		
	}
		
	//Update 
	

	public void updateEmployee(int id, Employee employee) {
		
		EntityManager entityManager=getEntityManager();
	    Employee dbEmployee= entityManager.find(Employee.class, id);
	     
	    if(dbEmployee !=null) {
	    	
	    	//id is present and then i can update the data
	    	
	    	EntityTransaction entityTransaction=entityManager.getTransaction();
	    	entityTransaction.begin();
	    	employee.setId(id);
	    	entityManager.merge(employee);
	    	entityTransaction.commit();
	    }
	    
	    else {
	    	System.out.println("Sorry id not present");
	    }
		
	}
	
	
	//find
	public void findEmployee(int id) {
		EntityManager entityManager=getEntityManager();
		Employee dbEmployee=entityManager.find(Employee.class,id);
		if(dbEmployee != null) {
			System.out.println(dbEmployee);
		}
		else {
			System.out.println("Sorry i d not present");
		}
	}
	
	
	//delete
	public void deleteEmployee(int id) {
		EntityManager entityManager=getEntityManager();
		Employee dbEmployee=entityManager.find(Employee.class,id);
		if(dbEmployee != null) {
			System.out.println(dbEmployee);
			System.out.print("It successfullu delete");
		}
		else {
			System.out.println("Sorry i d not present");
		}
	

	}
	}

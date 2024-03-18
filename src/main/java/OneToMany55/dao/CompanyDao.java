package OneToMany55.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToMany55.dto.Company;



public class CompanyDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return 	entityManager;
		}
//save
	
	public void saveCompany(Company company) {
		 EntityManager entityManager=getEntityManager();
		 EntityTransaction entityTransaction = entityManager.getTransaction();
		 entityTransaction.begin();
		 entityManager.persist(company);
		 entityTransaction.commit();	
		 
	}

	public void updateCompany(int id, Company company) {
		
		EntityManager entityManager=getEntityManager();
		Company dbCompany= entityManager.find(Company.class, id);
	     
	    if(dbCompany !=null) {
	    	
	    	EntityTransaction entityTransaction=entityManager.getTransaction();
	    	entityTransaction.begin();
	    	company.setId(id);
	    	entityManager.merge(company);
	    	entityTransaction.commit();
	    }
	    
	    else {
	    	System.out.println("Sorry id not present");
	    }
		
	}

	
//	/find
	public void findCompany(int id) {
		EntityManager entityManager=getEntityManager();
		Company dbCompany=entityManager.find(Company.class,id);
		if(dbCompany != null) {
			System.out.println(dbCompany);
		}
		else {
			System.out.println("Sorry i d not present");
		}
	}
	

		//delete
	public void deleteCompany(int id) {
		EntityManager entityManager=getEntityManager();
		Company dbCompany=entityManager.find(Company.class,id);
		if(dbCompany != null) {
			System.out.println(dbCompany);
		}
		else {
			System.out.println("Sorry i d not present");
		}
	}
	
}

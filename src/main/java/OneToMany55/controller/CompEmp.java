package OneToMany55.controller;

import OneToMany55.dao.CompanyDao;
import OneToMany55.dao.EmployeeDao;
import OneToMany55.dto.Company;
import OneToMany55.dto.Employee;

public class CompEmp {

	public static void main(String[] args) {

		//Save
//		Company company = new Company();
//		company.setId(1111);
//		company.setName("Google");
//		company.setGst("Goo@#31234");
//		
//		CompanyDao companyDao=new CompanyDao();
//		companyDao.saveCompany(company);		
		
		
		Employee employee2 = new Employee();
		employee2.setId(1021);
		employee2.setName("Harshada Patil");
		employee2.setAddress("Jalgaon");
		
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.saveEmployee(1111, employee2);
		
		
		
		
		//Upadate
		
//		Company company =new Company();
//		company.setName("techinfoo");
//		company.setGst("tenfo#@45405");
//		
//		CompanyDao companyDao = new CompanyDao();
//		companyDao.updateCompany(3, company);
		
		//update emp
		

//		Employee employee = new Employee();
//		employee.setId(1001);
//		employee.setName("Sudarshan Kiran Patil");
//		employee.setAddress("Pune-Ravet");
//		
//		EmployeeDao employeeDao = new EmployeeDao();
//		employeeDao.updateEmployee(1001, employee);
		
		
		
		//find
//		EmployeeDao employeeDao = new EmployeeDao();
//		employeeDao.findEmployee(1001);

		
		//delete
		
//		EmployeeDao employeeDao=new EmployeeDao();
//		employeeDao.deleteEmployee();
	}

}

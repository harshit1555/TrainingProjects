package com.cognizant.ormlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;

import java.time.LocalDate;
import java.util.List;import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class OrmLearnApplication {
	private static final Logger LOGGER=LoggerFactory.getLogger(OrmLearnApplication.class);
	
	private static CountryService countryService;
	private static EmployeeService employeeService;
	private static DepartmentService departmentService;
	private static SkillService skillService;
//	To find data Country starts  with the string
	private static void testGetCountryStartWith()
	{
		LOGGER.info("Start");
		List<Country> countries=countryService.getfindByName("Z");
		LOGGER.debug("countries={}",countries);
		LOGGER.info("End");
	}
//	To find data by name containing
	private static void testFindByName()
	{
		LOGGER.info("Start");
		List<Country> countries=countryService.getfindByName("ou");
//		countries.forEach(e->{
//			System.out.println("abc"+e);
//		});
		LOGGER.debug("countries={}",countries);
		LOGGER.info("End");
		
	}
//	To find country by code
	private static void testGetCountryByCode()
	{
		LOGGER.info("Start");
		Country country=countryService.getCountryByCode("IN");
		LOGGER.debug("Data retrived from table is country={} ",country);
		LOGGER.info("End");
	}
//	to get all items from table
	private static void testGetAllCountries()
	{
		LOGGER.info("Start");
		List<Country> countries=countryService.getAllCountries();
		LOGGER.debug("countries={}",countries);
		LOGGER.info("End");
	}
//	to add elements in table
	private static void testAddCountry()
	{
		Country country=new Country();
		country.setCode("BR");
		country.setName("Brazil");
		LOGGER.info("Start");
		countryService.addCountry(country);
		LOGGER.info("Row Added successfully");
		LOGGER.info("End");
	}
//	To Update the Country
	private static void testUpdateCountry()
	{
		LOGGER.info("Start");
		countryService.updateCountry("CH");
		LOGGER.info("Row Updated successfully");
		LOGGER.info("End");
		
	}
//	To Delete the element
	private static void testDeleteCountry()
	{
		LOGGER.info("Start");
		countryService.deleteCountry("CH");
		LOGGER.info("Row Deleted successfully");
		LOGGER.info("End");

	}
//	Many To One
	private static void testGetEmployee()
	{
		LOGGER.info("Start");
		Employee employee=employeeService.get(6);
		LOGGER.debug("Employee:{}",employee);
		LOGGER.debug("Department:{}", employee.getDepartment());
		LOGGER.debug("Skills:{}",employee.getSkillList());
		LOGGER.info("End");
	}
//	Many To One Save Data
	private static void testSaveEmployee()
	{
		Department department=new Department();
		
		department.setName("IT");
		Employee employee=new Employee();
		employee.setName("Harshdeep");
		employee.setPermanent(true);
		employee.setSalary(18000);
		employee.setDateOfBirth(LocalDate.of(1997,10,13));
		employee.setDepartment(department);
		Skill skill=new Skill();
		skill.setId(1);
		skill.setName("OOPS");
		
		employeeService.save(employee);
		
	}
//	One To Many
	private static void testGetDepartment()
	{
		LOGGER.info("Start");
		Department department=departmentService.get(7);
		LOGGER.debug("Department:{}",department);
		LOGGER.debug("Employee:{}",department.getEmployeeList());
		LOGGER.info("End");
		
	}
//	To get all permanent employee
	public static void testGetAllPermanentEmployees() {

		LOGGER.info("Start");

		List<Employee> employees = employeeService.getallPermanentEmployees();

		LOGGER.debug("Permanent Employees:{}", employees);

		employees.forEach(e -> LOGGER.debug("Skills:{}", e.getSkillList()));

		LOGGER.info("End");

		}
//	Test Get Average Salary
	public static void testGetAverageSalary()
	{
		LOGGER.info("Start");
		double salary=employeeService.getAverageSalary(7);
		LOGGER.debug("Average Salary:{}", salary);
		LOGGER.info("End");
	}
//	Get All employee by using native query
	public static void testGetEmployeeByNative()
	{
		LOGGER.info("Start");
		List<Employee> employee=employeeService.getEmployeesByNative();
		LOGGER.debug("Employee:{}",employee);
		LOGGER.info("End");
	}
//	Update Employee
	public static void testUpdateEmployee()
	{
		Employee employee=employeeService.get(12);
		Department department=new Department();
		
		department.setName("IT");
		
		employee.setName("Abhisek");
		employee.setPermanent(true);
		employee.setSalary(30000);
		employee.setDateOfBirth(LocalDate.of(1996,11,12));
		employee.setDepartment(department);
		employeeService.save(employee);
		
	}
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(OrmLearnApplication.class, args);
		countryService =context.getBean(CountryService.class);
		employeeService=context.getBean(EmployeeService.class);
		departmentService=context.getBean(DepartmentService.class);
		skillService=context.getBean(SkillService.class);
//		testUpdateEmployee();
//		testGetEmployeeByNative();
//		testGetAverageSalary();
//		testGetAllPermanentEmployees();
//		testGetDepartment();
//		testSaveEmployee();
//		testGetEmployee();
//		testGetCountryStartWith();
//		testFindByName();
//		testGetCountryByCode();
//		testGetAllCountries();
//		testAddCountry();
//		testUpdateCountry();
//		testDeleteCountry();
	}

}

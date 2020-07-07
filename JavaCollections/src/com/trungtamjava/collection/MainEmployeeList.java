package com.trungtamjava.collection;

import java.util.ArrayList;
import java.util.List;

import com.trungtamjava.model.Employee;
import com.trungtamjava.model.Person;
import com.trungtamjava.service.PersonService;
import com.trungtamjava.service.PersonServiceImpl;

public class MainEmployeeList {
	public static void main(String[] args) {
		List<Employee> persons = new ArrayList<Employee>();

		PersonService personService = new PersonServiceImpl();

		for (int i = 0; i < 5; i++) {
			Employee employee = new Employee();// fai gan
			personService.input(employee);
			
			persons.add(employee);//ad vao list
		}
		// for each
		for (Person p : persons) {
			personService.info(p);
		}

	}
}

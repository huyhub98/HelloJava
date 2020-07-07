package main;

import model.Employee;
import model.Person;
import service.PersonService;
import service.PersonServiceImpl;

public class MainEmployee {
	public static void main(String[] args) {
		Person p1 = new Employee();

		PersonService personService = new PersonServiceImpl();///da hinh dung interface cha la dai dien cho doi tuong con impl
		personService.input(p1);
		personService.info(p1);

		
	}

	
}

package com.trungtamjava.master.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.trungtamjava.master.hellospring.model.PersonDTO;

@SpringBootApplication
public class HellospringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellospringApplication.class, args);
	}

	/// TAO BEAN O DAY. HOAC O DAU DO CUNG DC
	// IOC - singleton
	@Bean("p1") // luc nay doi tuong p1, se dc spring quan ly
	public PersonDTO p1() {
		// tao 1 doi tuong
		PersonDTO p1 = new PersonDTO();
		p1.setId(1);
		p1.setName("P1");
		return p1;
	}

	@Bean("p2") // luc nay doi tuong p1, se dc spring quan ly
	public PersonDTO p2() {
		// tao 1 doi tuong
		PersonDTO p2 = new PersonDTO();
		p2.setId(2);
		p2.setName("P2");
		return p2;
	}

}

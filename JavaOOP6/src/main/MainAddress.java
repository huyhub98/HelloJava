package main;

import model.Address;
import service.AddressService;
import service.AddressServiceImpl;

public class MainAddress {
	public static void main(String[] args) {
		Address hanoi = new Address();
		
		AddressService addressService = new AddressServiceImpl();///da hinh o day dung interface cha dai dien cho con
		
		addressService.input(hanoi);// add = hanoi
		
		addressService.info(hanoi);
	}

	
}

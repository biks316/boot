package com.test.model;

import org.springframework.beans.factory.annotation.Autowired;
import com.test.travel.*;

public class Client {
	
@Autowired
Address address;


public void setadress() {
	address.setCountry("Neapl");
}




}

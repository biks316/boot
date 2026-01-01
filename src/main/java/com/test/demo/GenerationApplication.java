package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.travel.Customer;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
public class GenerationApplication {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		SpringApplication.run(GenerationApplication.class, args);
		
		InputStream inputStream = new ClassPathResource("openapi/input_john.json").getInputStream();
     
		ObjectMapper mapper = new ObjectMapper();
		Customer customer = mapper.readValue(inputStream, Customer.class);

		Customer copy = mapper.readValue(
		        mapper.writeValueAsString(customer), Customer.class
		);
		
		
		 System.out.print(copy.getAddress());
		 
		
	}

}

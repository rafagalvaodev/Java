package com.devsuperior.uri2602;

import com.devsuperior.uri2602.dto.CustomerMinDTO;
import com.devsuperior.uri2602.projection.CustomerMinProjection;
import com.devsuperior.uri2602.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Uri2602Application implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(Uri2602Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<CustomerMinProjection> listState = customerRepository.searchOne("rs");

		List<CustomerMinDTO> resultOne = listState
				.stream()
				.map(CustomerMinDTO::new)
				.collect(Collectors.toList());

		List<CustomerMinProjection> listStateName = customerRepository.searchTwo("rs");

		List<CustomerMinDTO> resultTwo = listStateName
				.stream()
				.map(CustomerMinDTO::new)
				.collect(Collectors.toList());

		System.out.println("\n\nConsultas SQL Raiz");
		for (CustomerMinDTO cmdto : resultOne){
			System.out.println(cmdto.getName());
		}


		System.out.println("\n\nConsulta SQL Raiz nome e estado");
		for (CustomerMinDTO cmdto : resultTwo){
			System.out.println(cmdto.toString());
		}

		System.out.println("Consulta JPQL");
		List<CustomerMinDTO> listStates = customerRepository.searchThree("rs");
		for (CustomerMinDTO obj : listStates){
			System.out.println(obj.getName());
		}

		List<CustomerMinDTO> listNameStates = customerRepository.searchFor("rs");
		for (CustomerMinDTO obj : listNameStates){
			System.out.println(obj);
		}

	}
}

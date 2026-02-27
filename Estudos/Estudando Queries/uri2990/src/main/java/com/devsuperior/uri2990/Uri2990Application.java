package com.devsuperior.uri2990;

import com.devsuperior.uri2990.dto.EmpregadoDeptDTO;
import com.devsuperior.uri2990.projections.EmpregadoDeptProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.uri2990.repositories.EmpregadoRepository;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Uri2990Application implements CommandLineRunner {

	@Autowired
	private EmpregadoRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(Uri2990Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<EmpregadoDeptProjection> listOne = repository.searchOne();

		List<EmpregadoDeptDTO> searchOne =
				listOne.stream()
						.map(EmpregadoDeptDTO::new)
						.collect(Collectors.toList());
		//System.out.println("Consulta SQL Raiz 1");
//		for(EmpregadoDeptDTO empregados : searchOne){
//			System.out.println(empregados);
//		}


		List<EmpregadoDeptProjection> listTwo = repository.searchTwo();

		List<EmpregadoDeptDTO> searchTwo =
				listTwo.stream()
						.map(EmpregadoDeptDTO::new)
						.collect(Collectors.toList());

		System.out.println("Consulta SQL Raiz 2");
		for(EmpregadoDeptDTO empregados : searchTwo){
			System.out.println(empregados);
		}



		List<EmpregadoDeptDTO> searchThree = repository.searchThree();


		System.out.println("Consulta JPQL");
		for(EmpregadoDeptDTO empregados : searchThree){
			System.out.println(empregados);
		}


	}
}

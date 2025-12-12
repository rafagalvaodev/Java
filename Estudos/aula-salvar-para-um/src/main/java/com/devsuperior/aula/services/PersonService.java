package com.devsuperior.aula.services;

import com.devsuperior.aula.dto.PersonDepartamentDTO;
import com.devsuperior.aula.dto.PersonDTO;
import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.repositories.DepartmentRepository;
import com.devsuperior.aula.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    @Autowired
    private DepartmentRepository departmentRepository;

    /*
    *
    * Dessa forma podemos pegar o id do departament mas o nome vem nulo
    *       public PersonDepartamentDTO insert(PersonDepartamentDTO dto){
    *           Person entity = new Person();
    *           entity.setName(dto.getName());
    *           entity.setSalary(dto.getSalary());
    *
    *           Department department = new Department();
    *           department.setId(dto.getDepartment().getId());
    *
    *           entity.setDepartment(department);
    *           entity = repository.save(entity);
    *
    *            return new PersonDepartamentDTO(entity);
    *       }
    * */


    /*
    * Dessa forma podemos pegar o id e o nome do departament
    * public PersonDepartamentDTO insert(PersonDepartamentDTO dto){
    *   Person entity = new Person();
    *   entity.setName(dto.getName());
    *   entity.setSalary(dto.getSalary());
    *
    *   Department department = departmentRepository.
    *       getReferenceById(
    *        dto.
    *        getDepartment().
    *        getId());
    *
    *   entity.setDepartment(department);
    *   entity = repository.save(entity);
    *   return new PersonDepartamentDTO(entity);
    *
    *  }
    * */


    public PersonDepartamentDTO insert(PersonDepartamentDTO dto){
        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department department = departmentRepository.
                getReferenceById(
                        dto.
                                getDepartment().
                                getId());

        entity.setDepartment(department);
        entity = repository.save(entity);

        return new PersonDepartamentDTO(entity);

    }
    
    /*
     *
     *  Dessa forma setamos apenas o id do departament
     * */

    @Transactional
    public PersonDTO insert(PersonDTO dto){
        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

     //  Department department = departmentRepository.getReferenceById(dto.getDepartmentId());

        Department department = new Department();
        department.setId(dto.getDepartmentId());

        entity.setDepartment(department);
        entity = repository.save(entity);

        return new PersonDTO(entity);

    }

}

package com.devsuperior.aula.dto;


import com.devsuperior.aula.entities.Person;

public class PersonDepartamentDTO {
    private Long id;
    private String name;
    private Double salary;
    private DepartamentDto department;

    public PersonDepartamentDTO(Long id, String name, Double salary, DepartamentDto department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public PersonDepartamentDTO(Person entity) {
        id = entity.getId();
        name = entity.getName();
        salary = entity.getSalary();
        department = new DepartamentDto(entity.getDepartment());
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public DepartamentDto getDepartment() {
        return department;
    }
}

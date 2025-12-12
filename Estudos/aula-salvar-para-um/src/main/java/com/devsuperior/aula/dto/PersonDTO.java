package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public class PersonDTO {
    private Long id;
    private String name;
    private Double salary;
    private Long departmentId;

    public PersonDTO(Long id, Long departmentId, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    public PersonDTO(Person entity) {
        id = entity.getId();
        name = entity.getName();
        salary = entity.getSalary();
        departmentId = entity.getDepartment().getId();
    }

    public Long getId() {
        return id;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }
}

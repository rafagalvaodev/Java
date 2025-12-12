package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Department;

public class DepartamentDto {

    private Long id;
    private String name;

    public DepartamentDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DepartamentDto(Department entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

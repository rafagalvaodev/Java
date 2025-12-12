package com.desafio3.crudClient.dto;

import com.desafio3.crudClient.entity.Client;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class ClientDTO {
    private Long id;

    @NotBlank(message = "O nome não pode ser vazio")
    private String name;

    @Size(min = 9, max = 15, message = "O CPF deve ter no minimo 9 caracters e no maximo 15")
    private String cpf;

    @PositiveOrZero
    private Double income;

    @PastOrPresent(message = "A data de aniversario não pode ser uma data futura")
    private LocalDate birthDate;

    @PositiveOrZero
    private Integer children;

    public ClientDTO() {
    }

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}

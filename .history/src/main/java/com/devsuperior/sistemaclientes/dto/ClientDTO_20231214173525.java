package com.devsuperior.sistemaclientes.dto;

import java.time.LocalDate;

import com.devsuperior.sistemaclientes.entities.Client;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ClientDTO {
    private Long id;
    @Size(min = 3, max = 80, message = "Nome precisa ter de 3  80 caracteres")
    @NotBlank(message = "N")
    private String name;
    @Column(unique = true)
    private String cpf;
    @Positive(message = "O preço deve ser positivo")
    private Double income;
    private LocalDate birthday;
    private Integer children;

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthday, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthday = birthday;
        this.children = children;
    }

    public ClientDTO(Client entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.cpf = entity.getCpf();
        this.income = entity.getIncome();
        this.birthday = entity.getBirthday();
        this.children = entity.getChildren();
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public Integer getChildren() {
        return children;
    }



}

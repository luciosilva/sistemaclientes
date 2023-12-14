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
    @NotBlank(message = "Campo requerido")
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
        this.birthday = birthday;
    }

    public ClientDTO(Client entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.description = entity.getDescription();
        this.price = entity.getPrice();
        this.imgUrl = entity.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    

}

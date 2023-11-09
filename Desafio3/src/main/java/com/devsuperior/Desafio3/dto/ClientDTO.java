package com.devsuperior.Desafio3.dto;

import com.devsuperior.Desafio3.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class ClientDTO {
    private Long id;
    @NotBlank
    private String name;
    @NotBlank(message = "Campo requerido")
    private String cpf;
    private Double income;
    @PastOrPresent
    private LocalDate birthDate;
    private Integer children;

    public ClientDTO(Client c){
        this.id = c.getId();
        this.name = c.getName();
        this.cpf = c.getCpf();
        this.income = c.getIncome();
        this.birthDate = c.getBirthDate();
        this.children = c.getChildren();
    }

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
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

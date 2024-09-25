package com.example.demo.car;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Table(name = "cars") // Especifica o nome da tabela como "cars"
public class Car {
    @Id
    UUID id;

    @NotBlank
    String marca;

    @NotBlank
    String modelo;

    @Min(1)
    int preco;

}

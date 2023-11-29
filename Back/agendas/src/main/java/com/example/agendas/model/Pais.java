package com.example.agendas.model;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
public class Pais {
    @Id
    private Long cpf;
    private String nome;
    private String filho;
    private String senha;

}

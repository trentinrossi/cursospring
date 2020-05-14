package com.rossi.cursomc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity // Esta anotação que faz com que a tabela seja criada no banco de dados
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    // Uma categoria possui vários produtos, por isso essa lista
    @ManyToMany(mappedBy = "categorias") // Como já foi feito todo o relacionamento lá na classe Produto, então aqui
                                         // somente informo o nome do atributo ao qual foi feito o relacionamento lá
    private List<Produto> produtos = new ArrayList<>();
}
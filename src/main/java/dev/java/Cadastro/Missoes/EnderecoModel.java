package dev.java.Cadastro.Missoes;

import dev.java.Cadastro.Usuarios.UsuarioModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_endereco")
public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rua;

    private String bairro;

    private int numero_casa;


    // Uma cidade pode ter vários usuários.
    @OneToMany(mappedBy = "cidades")
    private List<UsuarioModel> usuarios;



}

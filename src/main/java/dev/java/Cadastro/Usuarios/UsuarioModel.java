package dev.java.Cadastro.Usuarios;

import dev.java.Cadastro.Missoes.EnderecoModel;
import jakarta.persistence.*;

import java.util.List;

//Entity transforma uma classe em uma entidade do BD.
@Entity
@Table(name = "tb_cadastro")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String sobrenome;

    private String email;

    private int idade;

    //private List<EnderecoModel> missoes;


    // Uma usuário possui apenas umas cidade.
    @ManyToOne
    @JoinColumn(name = "cidades_id") // Foreign Key
    private EnderecoModel cidades;

    public UsuarioModel() {
    }


    public UsuarioModel(String nome, String sobrenome, String email, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

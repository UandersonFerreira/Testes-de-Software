package org.example;

import lombok.Builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Estudante {
    String nome;
     String matricula;
     String dataNascimento;
      String endereco;
     String emailInstitucional;
    List<Celular> celularList;



    public Estudante() {
    }

    public Estudante(String nome, String dataNascimento, String endereco, String emailInstitucional, List<Celular> celularList) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.emailInstitucional = emailInstitucional;
        this.celularList = celularList;
        gerarMatricula();
    }

    public Estudante(String nome, String dataNascimento, String endereco, String emailInstitucional) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.emailInstitucional = emailInstitucional;
        gerarMatricula();
    }
    private String gerarMatricula(){
        matricula = String.valueOf(nome.charAt(0)) + LocalDate.now().getYear();
        return matricula;
    }
    public static Boolean cadastrarEstudante( List<Estudante> listDeEstudante, Estudante estudante){
        if (estudante.celularList == null ||estudante.nome == null || estudante.matricula == null
        || estudante.dataNascimento == null || estudante.endereco == null || estudante.emailInstitucional == null){
            return false;
        }
        return listDeEstudante.add(estudante);
    }


    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", endereco='" + endereco + '\'' +
                ", emailInstitucional='" + emailInstitucional + '\'' +
                ", celularList=" + celularList +
                '}';
    }



}//class



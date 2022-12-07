package org.example;

import java.util.List;

public class Curso {
    String nome;
    String cargaHorario;
    String descricao;

    public Curso(String nome, String cargaHorario, String descricao) {
        this.nome = nome;
        this.cargaHorario = cargaHorario;
        this.descricao = descricao;
    }

    public Boolean cadastrarCurso(List<Curso> listaDeCursos,  Curso curso){
        if (curso.nome == null || curso.cargaHorario == null || curso.descricao == null){
            return false;
        }
        return listaDeCursos.add(curso);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", cargaHorario='" + cargaHorario + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}//class

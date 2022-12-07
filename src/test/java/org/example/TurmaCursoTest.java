package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TurmaCursoTest {
    TurmaCurso turmaCursoValida;
    TurmaCurso turmaCursoInvalida;
    LocalDate inicioAulas, fimAulas;
    LocalDate inicioMatriculas, fimMatriculas;
    LocalDate inicioMatriculasInvalida, fimMatriculasInvalido;
    Curso curso;
    List<TurmaCurso> turmaCursoList = new ArrayList<>();
    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");


    @BeforeEach
    public void setUp(){
        curso = new Curso("Sistemas para a Internet", "2000", "Curse Superior de Desenvolvimento");
        inicioAulas = LocalDate.parse("2023-02-15");
        fimAulas = LocalDate.parse("2023-06-25");
        inicioMatriculas = LocalDate.parse("2023-01-05");
        fimMatriculas =  LocalDate.parse("2023-02-05");
        fimMatriculasInvalido =  LocalDate.parse("2023-01-04");

        turmaCursoValida =  new TurmaCurso("IFTO",50,25,inicioAulas,fimAulas,inicioMatriculas,fimMatriculas,curso);
        turmaCursoInvalida =  new TurmaCurso("IFTO",50,25,inicioAulas,fimAulas,inicioMatriculas,fimMatriculasInvalido,curso);

    }

    @Test
    void trueAocadastrarTurmaDeUmCursoComDatasValidas() {
        Assertions.assertEquals(true, turmaCursoValida.cadastrarTurmaDeUmCurso(turmaCursoList, turmaCursoValida));
    }

    @Test
    void falseAocadastrarTurmaDeUmCursoComDatasInvalidas() {
        Assertions.assertEquals(false, turmaCursoInvalida.cadastrarTurmaDeUmCurso(turmaCursoList, turmaCursoInvalida));
    }



}//class teste
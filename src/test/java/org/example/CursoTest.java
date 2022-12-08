package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {
    Curso cursoValido;
    Curso cursoInvalido;
    List<Curso> cursoList = new ArrayList<>();

    @BeforeEach
    public void setUp(){
        cursoValido =  new Curso("Sistemas para a Internet", "2000", "Curse Superior de Desenvolvimento");
        cursoInvalido =  new Curso(null, "1200", "Curso Tecnico de Administração");
    }



    @Test
    void trueAocadastrarCursoComTodosOsValores() {
        Assertions.assertEquals(true, cursoValido.cadastrarCurso(cursoList, cursoValido));
    }
    @Test
    void throwExceptionAocadastrarCursoComValoresFaltando() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> cursoInvalido.cadastrarCurso(cursoList, cursoInvalido), "Os campos precisam ser preenchidos!");
    }

}//class test
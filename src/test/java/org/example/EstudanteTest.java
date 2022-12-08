package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class EstudanteTest {
    Estudante estudanteValido;
    Estudante estudanteInvalido;
    Estudante estudanteMenorDeIdade;
    List<Estudante> estudanteList =  new ArrayList<>();

    @BeforeEach
    public void setUp(){
        estudanteValido = new Estudante("uanderson", "2002-08-13",
                "Rua das Laranjeiras", "estudante@gmail.com",
                Celular.criarCelular());
        estudanteMenorDeIdade = new Estudante("uanderson", "2010-08-13",
                "Rua das Laranjeiras", "estudante@gmail.com",
                Celular.criarCelular());

        estudanteInvalido = new Estudante("uanderson", "2002-08-13", "Rua das Laranjeiras", "estudante@gmail.com");
    }

    @Test
    void trueAoCadastrarEstudanteComUmCelular() {
        Assertions.assertEquals(true, Estudante.cadastrarEstudante(estudanteList,estudanteValido));
    }

    @Test
    void throwExceptionAoCadastrarEstudanteFaltandoDados(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Estudante.cadastrarEstudante(estudanteList,estudanteInvalido), "Os campos precisam ser preenchidos!");
    }

    @Test
    void throwExceptionAoCadastrarEstudanteMenorQue15Anos(){
        final IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> Estudante.cadastrarEstudante(estudanteList, estudanteMenorDeIdade));

        Assertions.assertEquals("Estudante têm que ter mais de 15 anos", exception.getMessage());
    }





}//class Test
package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class EstudanteTest {
    Estudante estudanteValido;
    Estudante estudanteInvalido;
    List<Estudante> estudanteList =  new ArrayList<>();

    @BeforeEach
    public void setUp(){
        estudanteValido = new Estudante("uanderson", "2002-08-13",
                "Rua das Laranjeiras", "estudante@gmail.com",
                Celular.criarCelular());

        estudanteInvalido = new Estudante("uanderson", "2002-08-13", "Rua das Laranjeiras", "estudante@gmail.com");
    }

    @Test
    void trueAoCadastrarEstudanteComUmCelular() {
        Assertions.assertEquals(true, Estudante.cadastrarEstudante(estudanteList,estudanteValido));
    }

    @Test
    void falseAoCadastrarEstudanteSemUmCelular() {
        Assertions.assertEquals(false, Estudante.cadastrarEstudante(estudanteList,estudanteInvalido));
    }



}//class Test
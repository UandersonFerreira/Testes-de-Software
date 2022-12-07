package org.example;

import java.time.Instant;
import java.util.Date;
import java.util.List;

public class EstudantesMatriculados {
    Date dataMatricula;
    List<Estudante> listEstudantesMatriculados;

    public EstudantesMatriculados(Date dataMatricula, List<Estudante> listEstudantesMatriculados) {
        this.dataMatricula = dataMatricula;
        this.listEstudantesMatriculados = listEstudantesMatriculados;
    }

    public List<Estudante> getMatriculados() {
        for (Estudante estudante : listEstudantesMatriculados) {
            System.out.println(estudante);
        }

        return listEstudantesMatriculados;
    }

    public void estudantesMatriculados(String matricula, Date dataMatricula) {

    }

    private Boolean podeMatricular(Date dataMatricula) {
        return !dataMatricula.before(Date.from(Instant.now()));
    }


}//class


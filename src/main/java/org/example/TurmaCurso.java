package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.MissingFormatArgumentException;

public class TurmaCurso {
    String local;
    int vagas;
    int vagasDisponiveis;
    LocalDate inicioAulas, fimAulas;
    LocalDate inicioMatriculas, fimMatriculas;
    Curso curso;

    public TurmaCurso(String local, int vagas, int vagasDisponiveis, LocalDate inicioAulas, LocalDate fimAulas, LocalDate inicioMatriculas, LocalDate fimMatriculas, Curso curso) {
        this.local = local;
        this.vagas = vagas;
        this.vagasDisponiveis = vagasDisponiveis;
        this.inicioAulas = inicioAulas;
        this.fimAulas = fimAulas;
        this.inicioMatriculas = inicioMatriculas;
        this.fimMatriculas = fimMatriculas;
        this.curso = curso;
    }

    public Boolean cadastrarTurmaDeUmCurso(  List<TurmaCurso> turmaCursoList,TurmaCurso turmaCurso){
        if (turmaCurso.local == null || turmaCurso.vagas == 0 || turmaCurso.vagasDisponiveis == 0
        || turmaCurso.inicioAulas == null || turmaCurso.fimAulas == null || turmaCurso.inicioMatriculas == null
        || turmaCurso.fimMatriculas == null || turmaCurso.curso == null){
            throw new IllegalArgumentException("Os campos precisam ser preenchidos!");
        }else if (turmaCurso.getPeriodoMatriculas() < 0) {
            throw new IllegalArgumentException("Periodo de Matricula Inválido!");
        }

        return turmaCursoList.add(turmaCurso);
    }

    public boolean isMaiorQueQuinzeAnos(Estudante estudante){
        final Period period = Period.between(LocalDate.parse(estudante.dataNascimento), LocalDate.now());
        if (period.getYears() > 15){
            return true;
        }
        return false;
    }

    public long getPeriodoMatriculas(){
        return ChronoUnit.DAYS.between( inicioMatriculas, fimMatriculas);
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    private void setVagasDisponiveis() {

    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public static void main(String[] args) {
       Curso curso = new Curso("Sistemas para a Internet", "2000", "Curse Superior de Desenvolvimento");

        LocalDate inicioAulas = LocalDate.parse("2023-02-15");
        LocalDate fimAulas = LocalDate.parse("2023-06-25");
        LocalDate inicioMatriculas = LocalDate.parse("2023-01-05");
        LocalDate fimMatriculas =  LocalDate.parse("2023-02-05");
        LocalDate fimMatriculasInvalido = LocalDate.parse("2023-01-04");

        TurmaCurso t =  new TurmaCurso("IFTO",50,25,inicioAulas,fimAulas,inicioMatriculas,fimMatriculasInvalido,curso);

        System.out.println(t.getPeriodoMatriculas());
    }
}//class

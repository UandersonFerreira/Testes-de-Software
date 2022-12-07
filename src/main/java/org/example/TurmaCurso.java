package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
            return false;
        } else if (turmaCurso.getPeriodoMatriculas() < 0) {
            return false;
        }

        return turmaCursoList.add(turmaCurso);
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
}//class

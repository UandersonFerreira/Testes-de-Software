package org.example;

import java.util.List;

public class Celular {
    String numero;

    public Celular(String numero) {
        this.numero = numero;
    }

    public static List<Celular> criarCelular(){
      List<Celular> celulars = List.of(
        new Celular("3584784422"),
        new Celular("3544878652")
      );

      return celulars;
    }

    @Override
    public String toString() {
        return "TEL:"+numero;
    }
}//class

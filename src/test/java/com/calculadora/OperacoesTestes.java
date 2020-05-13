package com.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.ArrayList;
import java.util.List;

public class OperacoesTestes {

    @Test
    public void testarSoma(){
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Assertions.assertEquals(Operacao.soma(numeros), 6);
    }

    @Test
    public void testarSomaDeDoisNumero(){
        Assertions.assertEquals(Operacao.soma(1, 1), 2);

    }

    @Test
    public void testarSubtracaoDeDoisNumero(){
        Assertions.assertEquals(Operacao.subtracao(1, 1), 0);
    }

    @Test
    public void testarSubtracao(){
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Assertions.assertEquals(Operacao.subtracao(numeros), -4);
    }

    @Test
    public void testarMultiplicacaoDeDoisNumero(){
        Assertions.assertEquals(Operacao.multiplicacao(4, 2), 8);
    }

    @Test
    public void testarMultiplicacao(){
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Assertions.assertEquals(Operacao.multiplicacao(numeros), 6);
    }
    @Test
    public void testarDivisaoDeDoisNumero(){
        Assertions.assertEquals(Operacao.divisao(2, 1), 2);
    }

    @Test
   public void testarValorInvalidoNaDivisao(){
      Assertions.assertEquals(Operacao.divisao(0, 3), 0);
      Assertions.assertThrows(ArithmeticException.class, () -> {Operacao.divisao(1,0);});
    }

}

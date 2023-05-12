package br.com.coder.app.calculo;

import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.logging.Logger1;
import br.com.coder.app.calculo.interno.OperacoesAritmeticas;

public class CalculadoraImpl implements Calculadora {

    private String id = "abc";

    private OperacoesAritmeticas op = new OperacoesAritmeticas();

    public double soma(double... nums) {
        Logger1.info("Somando...");

        return op.soma(nums);
    }


    public String getId (){
        return id;
    }
}

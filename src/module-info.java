open module app.calculo {

    requires transitive app.logging;
    exports br.com.coder.app.calculo;

    exports br.com.coder.app.calculo.interno to app.financeiro;

    requires app.api;
    provides br.com.cod3r.app.Calculadora
    with br.com.cod3r.app.CalculadoraImpl;


}
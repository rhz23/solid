package com.rodrigozaninelli.solid.srp;

public class CalculadoraBonificacao {

    public double calculaBonificacao(Colaborador colaborador){

        final var salarioBase = colaborador.salario();
        final var cargo = colaborador.cargo();

        return salarioBase + cargo.calculaBonificacao(salarioBase);

    }
}

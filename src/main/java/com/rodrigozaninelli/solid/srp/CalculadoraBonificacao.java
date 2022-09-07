package com.rodrigozaninelli.solid.srp;

public class CalculadoraBonificacao {

    public double calculaBonificacao(Colaborador colaborador){

        double bonificacao = 0;
        double salarioBase = colaborador.salario();

        if (colaborador.cargo() == Cargo.GERENTE) {
            bonificacao = salarioBase * 0.1;
        }
        if (colaborador.cargo() == Cargo.ANALISTA) {
            bonificacao = salarioBase * 0.05;
        }
        if (colaborador.cargo() == Cargo.DESENVOLVEDOR) {
            bonificacao = salarioBase * 0.01;
        }
        return bonificacao;
    }
}

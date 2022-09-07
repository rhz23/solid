package com.rodrigozaninelli.solid.srp;

import java.util.List;

public class Srp {

    public static void main(String[] args) {
        final Srp srp = new Srp();
        srp.executar();
    }

    private void executar(){

        final List<Colaborador> colaboradores = List.of(
                new Colaborador("Huguinho", Cargo.DESENVOLVEDOR, 500),
                new Colaborador("Zezinho", Cargo.ANALISTA, 1000),
                new Colaborador("Luizinho", Cargo.GERENTE, 2000)
        );

        final CalculadoraBonificacao calculadoraBonificacao = new CalculadoraBonificacao();

        colaboradores.forEach(colaborador -> {
            System.out.printf("O colaborador %s tem salario de %f%n",
                    colaborador.nome(), calculadoraBonificacao.calculaBonificacao(colaborador)).println();
        });
    }
}

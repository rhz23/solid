package com.rodrigozaninelli.solid.opc_dip;

import java.util.List;

/**
 * Open/Closed Principle
 * Dependency Inversion Principle
 */
public class OcpDip {

    public static void main(String[] args) {
        final OcpDip ocpDip = new OcpDip();
        ocpDip.executa();
    }

    private void executa(){

        final List<Item> itens = List.of(
                new Item("CPU Ryzen 5 5600", 1, 325),
                new Item("MB Asus TUF X570-Plus", 1, 165),
                new Item("Mem DDR4 HyperX Fury 16Gb", 2, 189),
                new Item("VGA GeForce RTX 3060Ti", 1, 499),
                new Item("SSD Samsung 980 Pro NVMe 500GB", 1, 100)
        );

        final Venda venda = new Venda("Nerd", "PF", "Paraná", itens);

        final Caixa caixa = new Caixa();

        final Venda vendaFaturada = caixa.faturar(venda);

        System.out.println("O desconto de venda é: " + vendaFaturada.getDesconto());
        System.out.println("O frete da venda é: " + vendaFaturada.getFrete());
    }
}

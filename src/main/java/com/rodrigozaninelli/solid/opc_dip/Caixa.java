package com.rodrigozaninelli.solid.opc_dip;

public class Caixa {

    private final Correio correio;
    private final EmissorNf emissorNf;
    private final IntegraParaEstoque integraParaEstoque;


    public Caixa() {
        this.correio = new Correio();
        this.emissorNf = new EmissorNf();
        this.integraParaEstoque = new IntegraParaEstoque();
    }

    public Venda faturar(Venda venda){
        //verifica o calculo do frete
        if(venda.getEstadoEntrega().equalsIgnoreCase("Parana")){
            venda.setFrete(25);
        } else {
            venda.setFrete(50);
        }

        //verifica calculo desconto
        if (venda.getTipoCliente().equals("PF")){
            venda.setDesconto(venda.getValorTotal() * 0.10);
        } else if (venda.getTipoCliente().equals("PJ")) {
            venda.setDesconto(venda.getValorTotal() * 0.05);
        } else {
            venda.setDesconto(venda.getValorTotal() * 0.02);
        }

        System.out.println("Venda Faturada!");

        this.emissorNf.emitir(); //emite nota fiscal
        this.correio.notificarCliente(); // dispara e-mail ao cliente
        this.integraParaEstoque.integrar(); // da baixa nos items do estoque

        return venda;
    }


}

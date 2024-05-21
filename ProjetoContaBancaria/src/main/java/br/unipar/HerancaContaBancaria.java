package br.unipar;

import java.util.UUID;

abstract class HerancaContaBancaria implements InterfaceContaBancaria{

    protected double saldo;
    private String numeroConta;

    public HerancaContaBancaria() {
        saldo = 0d;//"d" para identificar que e numero quebrado
        numeroConta = UUID.randomUUID().toString();
    }

    @Override
    public Double obterSaldo() {
        return saldo;
    }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    @Override
    public String retornarNumeroConta() {
        return numeroConta;
    }
}

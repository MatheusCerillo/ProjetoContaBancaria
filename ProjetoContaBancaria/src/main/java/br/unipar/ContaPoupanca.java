package br.unipar;

public class ContaPoupanca extends HerancaContaBancaria{

    @Override
    public boolean saque(Double valor) {
        if ((saldo -5 )>= valor ){
            saldo -= valor;
            return true;
        }
        return false;
    }
}

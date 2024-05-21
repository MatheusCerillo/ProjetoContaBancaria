import br.unipar.ContaCorrente;
import br.unipar.ContaPoupanca;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ContaBancariaTest {

    @Test
    public void testDepositoContaCorrente(){

        ContaCorrente conta = new ContaCorrente();

        conta.depositar(5000d);

        assertEquals(conta.obterSaldo(), 5000d);

    }

    @Test
    public void testSaqueContaCorrente(){

        ContaCorrente conta = new ContaCorrente();
        conta.depositar(3000d);
        boolean validacao = conta.saque(1500d);

        assertTrue(validacao);
        assertEquals(1500d, conta.obterSaldo());

    }

    @Test
    public void testSaqueMaiorSaldoContaCorrenteA(){

        ContaCorrente conta = new ContaCorrente();
        conta.depositar(3000d);
        boolean validacao = conta.saque(4500d);

        assertFalse(validacao);
        assertEquals(3000d, conta.obterSaldo());

    }

    @Test
    public void testDepositoContaPounpanca(){
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(5000d);
        assertEquals(conta.obterSaldo(), 5000d);
    }

    @Test
    public void testSaqueContaPoupanca(){
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(3000d);
        boolean validacao = conta.saque(3000d);

        assertTrue(validacao);
        assertEquals(0d, conta.obterSaldo());

    }

    @Test
    public void testSaqueMaiorSaldoContaPoupanca(){
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(3000d);
        boolean validacao = conta.saque(3000d);
        assertFalse(validacao);
        assertEquals(3000d, conta.obterSaldo());
    }



}

import ClassesQ1.BoletoBancario;
import ClassesQ1.CartaoCredito;
import ClassesQ1.PayPal;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        // Questão 1

        BoletoBancario bb = new BoletoBancario("123");
        bb.processarPagamento(20);

        CartaoCredito cc = new CartaoCredito("123", "xxx");
        cc.processarPagamento(20);

        PayPal pp = new PayPal();
        pp.processarPagamento(20);
    }
}

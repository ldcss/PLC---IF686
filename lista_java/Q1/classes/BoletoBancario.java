package ClassesQ1;
import java.util.Scanner;
class BoletoBancario implements FormaDePagamento {
    private String codigoBoleto;
    private Scanner scanner = new Scanner(System.in);

    public BoletoBancario(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public boolean autenticar() {
        System.out.println("Digite o código do boleto: ");
        String codigo = scanner.nextLine();

        return this.codigo.equals(codigo);
    }

    @Override
    public void processarPagamento(double valor) {
        if (this.autenticar()) {
            System.out.println("Pagamento com boleto bancário no valor de " + valor + " processado com sucesso");
        } else {
            throw new RuntimeException("Pagamento não autorizado");
        }
    }
}
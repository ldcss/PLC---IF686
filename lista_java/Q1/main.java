import java.util.Scanner;


interface FormaDePagamento {
  boolean autenticar();
  void processarPagamento(double valor);
}

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
        return this.codigoBoleto.equals(codigo);
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

class CartaoCredito implements FormaDePagamento {
  private String senha;
  private String codigo;
  Scanner scanner = new Scanner(System.in);

  public CartaoCredito(String senha, String codigo){
    this.senha = senha;
    this.codigo = codigo;
  }

  @Override
  public boolean autenticar() {

    System.out.println("Digite a seguir a senha do cartão: ");
    String senha = scanner.nextLine();

    System.out.println("Digite a seguir o codigo do cartão: ");
    String codigo = scanner.nextLine();

    return this.senha.equals(senha) && this.codigo.equals(codigo);
  }

  @Override
  public void processarPagamento(double valor) {
    if(this.autenticar()){
      System.out.println(
        "Pagamento com cartão de crédito no valor de " + valor + " processado com sucesso" 
      );
    } else {
      throw new RuntimeException("Pagamento não autorizado");
    }
    
  }
}

class PayPalClient{
    public String login;
    public String senha;
  
    PayPalClient(String login, String senha){
      this.login = login;
      this.senha = senha;
    }
  }

  class PayPal implements FormaDePagamento {
    PayPalClient[] users = new PayPalClient[]{
        new PayPalClient("ldcs", "1a5"),
        new PayPalClient("paguso", "5a9"),
        new PayPalClient("cbaa", "a157"),
    };
    private Scanner scanner = new Scanner(System.in);

    @Override
    public boolean autenticar() {
        System.out.println("Digite seu login");
        String login = scanner.nextLine();


        System.out.println("Digite sua senha");
        String senha = scanner.nextLine();

        for(int i = 0; i < users.length; i++){
            if(users[i].login.equals(login) && users[i].senha.equals(senha)){
              return true;
            }
          }
        return false;
    }

    @Override
    public void processarPagamento(double valor) {
        if (autenticar()) {
            System.out.println("Pagamento com PayPal no valor de " + valor + " processado com sucesso");
        } else {
            throw new RuntimeException("Pagamento não autorizado");
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        // Questão 1

        // No terminal você deve digitar as credenciais dadas para criar a classe

        BoletoBancario boleto1 = new BoletoBancario("123");
        boleto1.processarPagamento(50);

        BoletoBancario boleto2 = new BoletoBancario("2525");
        boleto2.processarPagamento(150);

        BoletoBancario boleto3 = new BoletoBancario("157");
        boleto3.processarPagamento(1500);

        CartaoCredito cartao1 = new CartaoCredito("1234", "abcd");
        cartao1.processarPagamento(15000);

        CartaoCredito cartao2 = new CartaoCredito("1524", "zzz");
        cartao2.processarPagamento(200);

        CartaoCredito cartao3 = new CartaoCredito("111", "lucas");
        cartao3.processarPagamento(371);

        PayPal paypal1 = new PayPal();
        paypal1.processarPagamento(355.2);

        PayPal paypal2 = new PayPal();
        paypal2.processarPagamento(100.1);
    
        PayPal paypal3 = new PayPal();
        paypal3.processarPagamento(1005);
    }
}

package ClassesQ1;
import java.util.Scanner;

public class CartaoCredito implements FormaDePagamento {
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
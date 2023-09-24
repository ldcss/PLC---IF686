package ClassesQ1;
import java.util.Scanner;

class PayPalClient{
    public String login;
    public String senha;
  
    PayPalClient(String login, String senha){
      this.login = login;
      this.senha = senha;
    }
  }

public class PayPal implements FormaDePagamento {
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

        for(int i = 0; i < clients.length; i++){
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
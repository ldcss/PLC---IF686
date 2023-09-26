import java.util.ArrayList;
import java.util.List;

class Tarefa<T> {
    private String descricao;
    private T responsavel;

    public Tarefa(String descricao, T responsavel) {
        this.descricao = descricao;
        this.responsavel = responsavel;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public T getResponsavel() {
        return this.responsavel;
    }
}

class MembroEquipe {
  private String nome;
  public MembroEquipe(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }
}

class LiderEquipe extends MembroEquipe {
    public LiderEquipe(String nome) {
        super(nome);
    }
}

public class Main {
  public static <T> double calcularCargadeTrabalho(List<Tarefa<T>> tarefas, T responsavel) {
      int cargaDeTrabalho = 0;
      for (Tarefa<T> tarefa : tarefas) {
          if (tarefa.getResponsavel().equals(responsavel)) {
              cargaDeTrabalho++;
          }
      }
      return cargaDeTrabalho;
    }

  public static void main(String[] args) {
    MembroEquipe membro1 = new MembroEquipe("Lucas");
    MembroEquipe membro2 = new MembroEquipe("Caio");
    LiderEquipe lider1 = new LiderEquipe("André");

    Tarefa<MembroEquipe> tarefa1 = new Tarefa<>("Passar em PLC", membro1);
    Tarefa<MembroEquipe> tarefa2 = new Tarefa<>("Dar uma boa monitoria de PLC", membro2);
    Tarefa<LiderEquipe> tarefa3 = new Tarefa<>("Aprovar Lucas Daniel", lider1);
    Tarefa<MembroEquipe> tarefa4 = new Tarefa<>("Codar bem em haskell", membro1);
    Tarefa<MembroEquipe> tarefa5 = new Tarefa<>("Analisar um dataframe dos reprovados de PLC", membro2);
    Tarefa<LiderEquipe> tarefa6 = new Tarefa<>("Fazer uma API em springboot", lider1);

    List<Tarefa<MembroEquipe>> tarefas = new ArrayList<>();

    List<Tarefa<LiderEquipe>> tasks = new ArrayList<>();

    tarefas.add(tarefa1);
    tarefas.add(tarefa2);
    tasks.add(tarefa3);
    tarefas.add(tarefa4);
    tarefas.add(tarefa5);
    tasks.add(tarefa6);

    double cargaLucas = calcularCargadeTrabalho(tarefas, membro1);
    double cargaCaio = calcularCargadeTrabalho(tarefas, membro2);
    double cargaAndré = calcularCargadeTrabalho(tasks, lider1);

    System.out.println("Carga de trabalho de Lucas: " + cargaLucas + " tarefas(s).");
    System.out.println("Carga de trabalho de Caio: " + cargaCaio + " tarefas(s).");
    System.out.println("Carga de trabalho de André: " + cargaAndré + " tarefas(s).");
  }
}
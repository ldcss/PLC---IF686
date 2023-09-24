package Q3;

import java.util.ArrayList;
import java.util.List;

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
    MembroEquipe membro1 = new MembroEquipe("João");
    MembroEquipe membro2 = new MembroEquipe("Maria");


    LiderEquipe lider1 = new LiderEquipe("Pedro");

    Tarefa<MembroEquipe> tarefa1 = new Tarefa<>("Desenvolvimento de código", membro1);
    Tarefa<MembroEquipe> tarefa2 = new Tarefa<>("Desenvolvimento de código", membro2);
    Tarefa<LiderEquipe> tarefa3 = new Tarefa<>("Desenvolvimento de código", lider1);

    List<Tarefa<MembroEquipe>> tarefas = new ArrayList<>();

    tarefas.add(tarefa1);
    tarefas.add(tarefa2);

    double cargaJoao = this.calcularCargadeTrabalho(tarefas, membro1);
    double cargaMaria = this.calcularCargadeTrabalho(tarefas, membro1);

    System.out.println("Carga de trabalho de João: " + cargaJoao + " tarefas(s).");
    System.out.println("Carga de trabalho de Maria: " + cargaMaria + " tarefas(s).");

  }
}
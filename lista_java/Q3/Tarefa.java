package Q3;

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
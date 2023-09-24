package Q4;

class Expresso extends Coffee {
    public Expresso() {
        super("Expresso", 30, 0, 20);
    }

    @Override
    public void prepare() {
        System.out.println("Preparando um Expresso...");
        System.out.println("Passo 1: Moer grãos de café.");
        System.out.println("Passo 2: Preparar o café Expresso.");
    }
}
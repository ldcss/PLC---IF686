package Q4;

class Latte extends Coffee {
    public Latte() {
        super("Latte", 20, 100, 10);
    }

    @Override
    public void prepare() {
        System.out.println("Preparando um Latte...");
        System.out.println("Passo 1: Moer grãos de café.");
        System.out.println("Passo 2: Preparar o café espresso.");
        System.out.println("Passo 3: Aquecer o leite.");
        System.out.println("Passo 4: Misturar o café espresso com o leite.");
    }
}
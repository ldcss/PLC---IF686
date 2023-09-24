package Q4;

class Cappuccino extends Coffee {
    public Cappuccino() {
        super("Cappuccino", 30, 50, 15);
    }

    @Override
    public void prepare() {
        System.out.println("Preparando um Cappuccino...");
        System.out.println("Passo 1: Moer grãos de café.");
        System.out.println("Passo 2: Preparar o café espresso.");
        System.out.println("Passo 3: Aquecer o leite.");
        System.out.println("Passo 4: Preparar a espuma de leite.");
        System.out.println("Passo 5: Misturar o café espresso com o leite e a espuma.");
    }
}
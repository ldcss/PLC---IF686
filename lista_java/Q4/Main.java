package Q4;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(500, 300, 100);

        Expresso Expresso = new Expresso();
        Latte latte = new Latte();
        Cappuccino cappuccino = new Cappuccino();

        coffeeMachine.makeCoffee(Expresso);
        coffeeMachine.makeCoffee(latte);
        coffeeMachine.makeCoffee(cappuccino);
    }
}
class Latte extends Coffee {
    public Latte() {
        super("Latte", 50, 50, 20);
    }

    @Override
    public void prepare() {
        System.out.println("O latte foi o café escolhido!");
        System.out.println("Estamos moendo os grãos.");
        System.out.println("Misturando a água esquentada com os grãos moídos.");
        System.out.println("Adicionamos o leite..");
        System.out.println("Misturando o café preparado com o leite.");
        System.out.println("Seu latte está pronto, sirva-se bem!");
    }
}

class Espresso extends Coffee {
    public Espresso() {
        super("Espresso", 25, 0, 30);
    }

    @Override
    public void prepare() {
        System.out.println("O espresso foi o café escolhido!");
        System.out.println("Estamos moendo os grãos.");
        System.out.println("Misturando a água esquentada com os grãos moídos.");
        System.out.println("Seu espresso está pronto, sirva-se bem!");
    }
}

class Cappuccino extends Coffee {
    public Cappuccino() {
        super("Cappuccino", 35, 50, 30);
    }

    @Override
    public void prepare() {
        System.out.println("O capuccino foi o café escolhido!");
        System.out.println("Estamos moendo os grãos.");
        System.out.println("Misturando a água esquentada com os grãos moídos.");
        System.out.println("Misturando o café preparado com o leite.");
        System.out.println("Extraindo o café espresso.");
        System.out.println("Vaporizando o leite para criar a espuma.");
        System.out.println("Seu capuccino está pronto, sirva-se bem!");
    }
}

abstract class Coffee {
    protected String name;
    protected double waterRequired;
    protected double milkRequired;
    protected double coffeeRequired;

    public Coffee(String name, double waterRequired, double milkRequired, double coffeeRequired) {
        this.name = name;
        this.waterRequired = waterRequired;
        this.milkRequired = milkRequired;
        this.coffeeRequired = coffeeRequired;
    }

    public abstract void prepare();
}

class CoffeeMachine {
    private double water;
    private double milk;
    private double coffee;

    public CoffeeMachine(double water, double milk, double coffee) {
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
    }

    public Boolean checkIngredients(Coffee coffee){
        return water >= coffee.waterRequired && milk >= coffee.milkRequired && this.coffee >= coffee.coffeeRequired;
    }

    public void makeCoffee(Coffee coffee) {
        if (checkIngredients(coffee)) {
            System.out.println("Iniciando a preparação de um " + coffee.name + "...");
            coffee.prepare();
            System.out.println("Café " + coffee.name + " pronto!");

            water -= coffee.waterRequired;
            milk -= coffee.milkRequired;
            this.coffee -= coffee.coffeeRequired;
        } else {
            System.out.println("Recursos insuficientes para fazer um " + coffee.name + ".");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(500, 300, 100);

        Espresso espresso = new Espresso();
        Latte latte = new Latte();
        Cappuccino cappuccino = new Cappuccino();

        coffeeMachine.makeCoffee(espresso);
        coffeeMachine.makeCoffee(latte);
        coffeeMachine.makeCoffee(cappuccino);

        CoffeeMachine coffeMachineBroken = new CoffeeMachine(0, 0, 0);

        coffeMachineBroken.makeCoffee(espresso);
        coffeMachineBroken.makeCoffee(latte);
        coffeMachineBroken.makeCoffee(cappuccino);
    }
}